package com.haydikodlayalim.dpatterns.factory;

public class Run {
    public static void main(String[] args) {
        String fileExcel = FileExporterFactory.getInstance(FileExporterFactory.FileType.EXCEL)
                .export(" Test content ");
        System.out.println(fileExcel);

        String filePdf = FileExporterFactory.getInstance(FileExporterFactory.FileType.EXCEL)
                .export(" Test content ");
        System.out.println(filePdf);
    }
}
