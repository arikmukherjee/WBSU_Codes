import re
import math
import matplotlib.pyplot as plt

def analyze_halstead(source_code):
    operators = [
        '=', '+', '-', '*', '/', '%', '**', '//',
        '==', '!=', '<', '<=', '>', '>=',
        '+=', '-=', '*=', '/=', '%=', '//=', '**=',
        'and', 'or', 'not', 'is', 'in', 'not in', 'is not'
    ]

    tokens = re.findall(r'\b\w+\b|[^\s\w]', source_code)

    operator_counts = []
    operand_counts = []

    for token in tokens:
        if token in operators:
            operator_counts.append(token)
        elif re.match(r'[A-Za-z_]\w*|\d+', token):
            operand_counts.append(token)

    n1 = len(set(operator_counts))     
    n2 = len(set(operand_counts))       
    N1 = len(operator_counts)          
    N2 = len(operand_counts)           

    n = n1 + n2                       
    N = N1 + N2                         

    try:
        V = N * math.log2(n) if n else 0
        D = (n1 / 2) * (N2 / n2) if n2 else 0
        E = D * V
        T = E / 18                     # Time to program (in seconds)
        B = (E ** (2/3)) / 3000        # Estimated number of bugs
    except (ZeroDivisionError, ValueError):
        V = D = E = T = B = 0

    return {
        "Vocabulary (n)": round(n, 2),
        "Program Length (N)": round(N, 2),
        "Volume (V)": round(V, 2),
        "Difficulty (D)": round(D, 2),
        "Effort (E)": round(E, 2),
        "Time to program (T seconds)": round(T, 2),
        "Estimated Bugs (B)": round(B, 2)
    }

def read_file(file_path):
    try:
        with open(file_path, 'r', encoding='utf-8') as f:
            return f.read()
    except FileNotFoundError:
        print("File not found.")
        return None

def plot_halstead_full(metrics):
    labels = list(metrics.keys())
    values = list(metrics.values())

    plt.figure(figsize=(12, 6))
    plt.plot(labels, values, marker='o', color='green', linewidth=2)

    for i, v in enumerate(values):
        plt.text(i, v + (0.05 * max(values)), f"{v:.2f}", ha='center', fontsize=9)

    plt.xticks(rotation=30)
    plt.title("Halstead Metrics (Line Graph)")
    plt.xlabel("Metrics")
    plt.ylabel("Values")
    plt.grid(True)
    plt.tight_layout()
    plt.show()

if __name__ == "__main__":
    path = input("Enter the path to the Python file you want to analyze: ").strip()
    code = read_file(path)

    if code:
        metrics = analyze_halstead(code)

        print("\nHalstead Complexity Metrics:")
        for k, v in metrics.items():
            print(f"{k}: {v}")

        plot_halstead_full(metrics)

     

