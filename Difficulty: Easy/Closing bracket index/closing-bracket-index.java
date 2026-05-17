class Sol {
    int closing(String s, int pos) {

        char open = s.charAt(pos);
        char close;

        if (open == '(') {
            close = ')';
        } else if (open == '[') {
            close = ']';
        } else {
            return -1;
        }

        int count = 0;

        for (int i = pos; i < s.length(); i++) {

            if (s.charAt(i) == open) {
                count++;
            }

            if (s.charAt(i) == close) {
                count--;
            }

            if (count == 0) {
                return i;
            }
        }

        return -1;
    }
}