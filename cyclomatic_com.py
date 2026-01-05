
import re
import os

def calculate_cyclomatic_complexity(code_text):
    # Decision/control points that increase complexity
    decision_keywords = ['if ', 'elif ', 'else:', 'for ', 'while ', 'case ', 'except', 'finally', ' and ', ' or ', 'match ']

    complexity = 1  
    lines = code_text.splitlines()

    for line in lines:
        line = line.strip()

        # Skip empty lines and comments
        if not line or line.startswith("#"):
            continue

        for keyword in decision_keywords:
            if keyword in line:
                complexity += 1

    return complexity

def interpret_complexity(cc):
    if cc <= 10:
        return "Low (Simple and maintainable)"
    elif cc <= 20:
        return "Moderate (Manageable complexity)"
    elif cc <= 50:
        return "High (Needs refactoring)"
    else:
        return "Very High (Extremely complex, avoid)"

def main():
    file_path = input("Enter path to Python (.py) file: ").strip()

    if not os.path.isfile(file_path):
        print("File not found.")
        return

    with open(file_path, 'r', encoding='utf-8') as f:
        code = f.read()

    cc = calculate_cyclomatic_complexity(code)
    interpretation = interpret_complexity(cc)

    print(f"\nCyclomatic Complexity of '{file_path}': {cc}")
    print(f"Interpretation: {interpretation}")

if __name__ == "__main__":
    main()

