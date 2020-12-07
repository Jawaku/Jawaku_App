package com.example.budayajawa;


public class QuestionBank {

    private String textQuestions [] = {
            "Raja Kerajaan Hastinapura adalah",
            "Ajian Naracabala dimiliki oleh",
            "Gada Rujakpolo adalah senjata dari",
            "Aksara Jawa dikenal sebagai, kecuali",
            "Aksara Carakan berjumlah",
            "Huruf yang merupakan Aksara Swara",
            "Krama digunakan untuk, kecuali",
            "Kata SINTEN memiliki arti",
            "Salah satu Tembang Dolanan yaitu",
            "DODOT IRO ada pada lagu"
    };

    // array of multiple choices for each question
    private String multipleChoice [][] = {
            {"Yudhistira","Bima","Arjuna", "Sadewa"},
            {"Yudhistira","Bima", "Arjuna", "Sadewa"},
            {"Yudhistira","Bima", "Arjuna", "Sadewa"},
            {"Hanacaraka", "Carakan", "Dentawyanjana", "Alfabet"},
            {"17", "18", "19", "20"},
            {"A", "B", "C", "D"},
            {"Orang tua", "Adik", "Guru", "Kakek"},
            {"Siapa", "Kapan", "Apa", "Dimana"},
            {"Korban Janji", "Cidro", "Padang Bulan", "Banyu Langit"},
            {"Gundul Pacul", "Ilir-ilir", "Padang Bulan", "Jamuran"}
    };

    private String mCorrectAnswers[] = {"Yudhistira", "Arjuna", "Bima", "Alfabet", "20", "A", "Adik", "Siapa", "Padang Bulan", "Ilir-ilir"};

    public int getLength(){
        return textQuestions.length;
    }

    public String getQuestion(int a) {
        String question = textQuestions[a];
        return question;
    }

    public String getChoice(int index, int num) {
        String choice0 = multipleChoice[index][num-1];
        return choice0;
    }

    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }
}