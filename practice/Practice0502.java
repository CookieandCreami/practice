//단어 반복(함수 X)
class Scratch {
    public static void main(String[] args) {

        String word = "hi";
        String answer = "";
        int n = 3;
        for (int i = 0; i < word.length(); i++) {
            for (int j = 0; j < n; j++) {
                answer += word.charAt(i);
            }
        }

        System.out.println(answer);

    }
}
