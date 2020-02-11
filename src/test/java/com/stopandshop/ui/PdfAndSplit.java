package com.stopandshop.ui;

import com.zeonpad.pdfcompare.ZPDFCompare;
import org.testng.annotations.Test;

import java.io.IOException;

public class PdfAndSplit {
    @Test
    public void test () throws IOException{
        ZPDFCompare obj = new ZPDFCompare();
        obj.pdfcompare("test1.pdf", "test2.pdf", "expectedFile_Diff.pdf", "actualFile_Diff.pdf");
    }
}
