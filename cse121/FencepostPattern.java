class FencepostPattern {
    public static void main(String[] args) {
        String s = "hello";
        for (int i = 0; i < (s.length() - 1); i++) {
            System.out.print(s.charAt(i) + "-");
        }
        System.out.println(s.charAt(s.length() - 1));
    }
}