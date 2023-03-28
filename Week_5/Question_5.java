public class Question_5 {
    public static void main(String[] args) {
        
        String[] key = {"D", "B","D", "C", "C", "D", "A", "E", "A", "D"};
        
        String[][] studentAnswers = { {"A", "B","A", "C", "C", "D", "E", "E", "A", "D"},    // Student 0
                                      {"D", "B","A", "B", "C", "A", "E", "E", "A", "D"},    // Student 1
                                      {"E", "D","D", "A", "C", "B", "E", "E", "A", "D"},    // Student 2
                                      {"C", "B","A", "E", "D", "C", "E", "E", "A", "D"},    // Student 3
                                      {"A", "B","D", "C", "C", "D", "E", "E", "A", "D"},    // Student 4
                                      {"B", "B","E", "C", "C", "D", "E", "E", "A", "D"},    // Student 5
                                      {"B", "B","A", "C", "C", "D", "E", "E", "A", "D"},    // Student 6
                                      {"E", "B","E", "C", "C", "D", "E", "E", "A", "D"}     // Student 7
                                    };
        int count = 0;
      
        for (int i = 0; i < studentAnswers.length; i++) {
            System.out.print("Student " + i + "'s correct count is ");
            for (int j = 0; j < studentAnswers[i].length; j++) {
                if(studentAnswers[i][j] == key[j]){
                    count++;
                }
            }
            System.out.println(count);
            count = 0;
        }

    }
}
