public class Student {
        Course c1;
        Course c2;
        Course c3;
        String name;
        String stuNo;
        String classes;
        double average;
        boolean isPass;

        Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3) {
            this.name = name;
            this.stuNo = stuNo;
            this.classes = classes;
            this.c1 = c1;
            this.c2 = c2;
            this.c3 = c3;
            calcAverage();
            this.average = 0.0;
            this.isPass = false;

        }

        void addBulkExamNote(int note1, int note2, int note3) {
            if (note1 >= 0 && note1 <= 100) {
                this.c1.note = note1;
            }
            if (note2 >= 0 && note2 <= 100) {
                this.c2.note = note2;
            }
            if (note3 >= 0 && note3 <= 100) {
                this.c3.note = note3;
            }
        }

        void isPass() {
            if (this.c1.note == 0 || this.c2.note == 0 || this.c3.note == 0) {
                System.out.println("Notlar tam olarak girilmemiş");
            } else {
                this.isPass = isCheckPass();
                printNote();
                System.out.println("========================");

                System.out.println("Ortalama : " + this.average);
                if (this.isPass) {
                    System.out.println("Sınıfı Geçti. ");
                } else {
                    System.out.println("Sınıfta Kaldı.");
                }
            }
        }

        public void calcAverage() {
            this.average = (this.c1.note + this.c2.note + this.c3.note) / 3;
        }

        public boolean isCheckPass() {
            calcAverage();
            return this.average > 55;
        }

        void printNote() {
            System.out.println("ÖĞRENCİ: " + this.name);
            System.out.println(this.c1.name + "Fizik Notunuz\t:" + this.c1.note);
            System.out.println(this.c2.name + " Kimya Notunuz\t:" + this.c2.note);
            System.out.println(this.c3.name + "Matematik Notunuz\t:" + this.c3.note);
            System.out.println("Ortalamanız: " + this.average);
        }
    }
