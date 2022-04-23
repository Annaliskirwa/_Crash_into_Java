class Characters{
    public static void main(String[]args){
        char ch = 'A';
        ch += 10;
        System.out.println(ch);   // 'K'
        System.out.println(++ch); // 'L'
        System.out.println(++ch); // 'M'
        System.out.println(--ch); // 'L'
    }
}