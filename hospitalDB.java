// Base Class
class Hospital {
    String hospitalName;
    String hospitalLocation;

    void setHospitalDetails(String name, String location) {
        hospitalName = name;
        hospitalLocation = location;
    }

    void displayHospitalDetails() {
        System.out.println("Hospital Name: " + hospitalName);
        System.out.println("Location: " + hospitalLocation);
    }
}

// Derived from Hospital
class Department extends Hospital {
    String departmentName;
    int departmentFloor;

    void setDepartmentDetails(String name, int floor) {
        departmentName = name;
        departmentFloor = floor;
    }

    void displayDepartmentDetails() {
        System.out.println("Department Name: " + departmentName);
        System.out.println("Located on Floor: " + departmentFloor);
    }
}

// Derived from Department
class Doctor extends Department {
    String doctorName;
    String specialization;

    void setDoctorDetails(String name, String spec) {
        doctorName = name;
        specialization = spec;
    }

    void displayDoctorDetails() {
        System.out.println("Doctor Name: " + doctorName);
        System.out.println("Specialization: " + specialization);
    }
}

// New class for Patient (independent)
class Patient {
    String patientName;
    int age;

    void setPatientDetails(String name, int age) {
        patientName = name;
        this.age = age;
    }

    void displayPatientDetails() {
        System.out.println("Patient Name: " + patientName);
        System.out.println("Age: " + age);
    }
}

// New class for Appointment (uses Doctor and Patient)
class Appointment {
    String date;
    String time;
    Doctor doctor;
    Patient patient;

    void setAppointmentDetails(String date, String time, Doctor doc, Patient pat) {
        this.date = date;
        this.time = time;
        this.doctor = doc;
        this.patient = pat;
    }

    void displayAppointmentDetails() {
        System.out.println("--- Appointment Details ---");
        System.out.println("Date: " + date);
        System.out.println("Time: " + time);
        System.out.println();
        System.out.println("--- Doctor Assigned ---");
        doctor.displayDoctorDetails();
        System.out.println();
        System.out.println("--- Patient Info ---");
        patient.displayPatientDetails();
    }
}

// Main class
public class HospitalManagement {
    public static void main(String[] args) {
        // Create doctor and set details
        Doctor doc = new Doctor();
        doc.setHospitalDetails("SSKM Hospital", "Kolkata");
        doc.setDepartmentDetails("Cardiology", 5);
        doc.setDoctorDetails("Ashutosh Banerjee", "Cardiologist");

        // Create patient and set details
        Patient pat = new Patient();
        pat.setPatientDetails("Seema Roy", 65);

        // Create appointment and link doctor + patient
        Appointment appt = new Appointment();
        appt.setAppointmentDetails("2025-05-10", "11:00 AM", doc, pat);

        // Display all details
        System.out.println("=== Hospital ===");
        doc.displayHospitalDetails();

        System.out.println("\n=== Department ===");
        doc.displayDepartmentDetails();

        System.out.println("\n=== Appointment Summary ===");
        appt.displayAppointmentDetails();
    }
}
