class OldSolution {
    public String smallestString(String s) {
        char[] chars = s.toCharArray();

        if (s.contains("a")) {
            if (s.equals("a")) {
                return "z";
            } else if (s.length() == 2) {
                if (s.charAt(0) == 'a' && s.charAt(1) == 'a') {
                    chars[1] = 'z';
                } else if (s.indexOf('a') == 0) {
                    chars[1] = (char) (((int) chars[1]) - 1);
                } else {
                    chars[0] = (char) (((int) chars[0]) - 1);
                }
            } else if (s.indexOf('a') >= (s.length() / 2) - 1) {
                for (int i = 0; i < s.indexOf('a'); i++) {
                    chars[i] = (char) (((int) chars[i]) - 1);
                }
            } else {
                for (int i = s.indexOf('a') + 1; i < s.length(); i++) {
                    chars[i] = (char) (((int) chars[i]) - 1);
                }
            }
        } else {
            for (int i = 0; i < s.length(); i++) {
                chars[i] = (char) (((int) chars[i]) - 1);
            }
        }

        return new String(chars);
    }

    public static void main(String[] args) {
        OldSolution sol = new OldSolution();
        System.out.println(sol.smallestString("aaa"));
    }
}
