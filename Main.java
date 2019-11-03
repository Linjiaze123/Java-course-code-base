package com.classbook.chapter.six2;

public class Main {
    public static void main(String[] args) {
        Fiction fiction = new Fiction();
        Magazine magazine = new Magazine();
        TextBook textBook = new TextBook();
        Periodical periodical = new Periodical();

        System.out.println("小说：");
        fiction.Effect();
        fiction.ReadingMode();
        System.out.println(fiction.toString());
        fiction.FitObject();

        System.out.println("\n杂志：");
        magazine.Effect();
        System.out.println(magazine.toString());

        System.out.println("\n期刊：");
        periodical.Effect();
        System.out.println(periodical.toString());

        System.out.println("\n课本：");
        textBook.Effect();
        textBook.FitObject();
        System.out.println(textBook.toString());
    }
}
