public class RecomandNewId {
    public String recommendNewId(String new_id) {
        /*
        // 1단계
        String answer = new_id.toLowerCase();
        // 2단계
        answer = answer.replaceAll("[^-_.a-z0-9]", "");
        // 3단계
        answer = answer.replaceAll("[.]{2,}", ".");
        // 4단계
        answer = answer.replaceAll("^[.]|[.]$", "");
        // 5단계
        if (answer.equals("")) {
            answer += "a";
        }
        //answer = answer.replaceAll( "", "a");
        // 6단계
        if (new_id.length() >= 16) {
            answer = answer.substring(0, 15);
            answer.replaceAll("[.]$", "");
        }
        // 7단계
        if (new_id.length() >= 2) {
            while (answer.length() < 3) {
                answer += answer.charAt(answer.length() - 1);
            }
        }

        return answer;
        */
        String answer = "";
        // 1단계
        String idStepOne = new_id.toLowerCase();

        // 2단계
        char[] stepOne = idStepOne.toCharArray();
        StringBuilder idStepTwo = new StringBuilder();
        for (char alphabet : stepOne) {
            if ((alphabet >= 'a' && alphabet <= 'z') || (alphabet >= '0' && alphabet <= '9') || alphabet == '-' || alphabet == '_' || alphabet == '.'){
                idStepTwo.append(alphabet);
            }
        }

        // 3단계
        String idStepThree = idStepTwo.toString().replace("..",".");
        while (idStepThree.contains("..")){
            idStepThree = idStepThree.replace("..", ".");
        }

        // 4단계
        String idStepFour = idStepThree;
        if (idStepFour.length() > 0) {
            if (idStepFour.charAt(0) == '.') {
                idStepFour = idStepFour.substring(1, idStepFour.length());
            }
        }
        if (idStepFour.charAt(idStepFour.length() - 1) == '.') {
            idStepFour = idStepFour.substring(0, idStepFour.length() - 1);
        }

        // 5단계
        String idStepFive = idStepFour;
        if (idStepFive.equals("")) {
            answer += "a";
        }

        // 6단계
        String idStepSix = idStepFive;
        if (new_id.length() >= 16) {
            answer = answer.substring(0, 15);
            if (idStepSix.charAt(idStepSix.length() - 1) == '.') {
                idStepSix = idStepSix.substring(0, idStepSix.length() - 1);
            }
        }

        // 7단계
        StringBuilder idStepSeven = new StringBuilder();
        if (new_id.length() <= 2) {
            char lastWord = idStepSeven.charAt(idStepSeven.length() - 1);
            while (idStepSeven.length() == 3) {
                idStepSeven.append(lastWord);
            }
        }
        answer = String.valueOf(idStepSeven);
        return answer;
    }
}
