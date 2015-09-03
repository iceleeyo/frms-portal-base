package cn.com.bsfit.frms.portal.base.util;

import org.apache.poi.hssf.usermodel.HSSFRichTextString;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFRichTextString;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Date;

/**
 * 导出，下载excel util
 *
 * @author Owner
 */
public class ExportExcel {
    protected Workbook workbook;
    protected Sheet sheet = null;
    protected CellStyle titleStyle;
    protected CellStyle cellStyle;
    protected boolean useNewVersion = false;
    protected int rowNum = 0;
    protected Font strCellfont;

    /**
     * export data to excel
     */
    public ExportExcel(String title) {
        // 声明一个工作薄
        if (useNewVersion) {
            workbook = new XSSFWorkbook();
        } else {
            workbook = new HSSFWorkbook();
        }
        // 生成一个表格
        sheet = workbook.createSheet(title);
        // 设置表格默认列宽度为18个字节
        sheet.setDefaultColumnWidth((short) 18);
        // 生成一个样式
        titleStyle = workbook.createCellStyle();
        // 设置这些样式
        titleStyle.setFillForegroundColor(IndexedColors.SKY_BLUE.getIndex());
        titleStyle.setFillPattern(CellStyle.SOLID_FOREGROUND);
        titleStyle.setBorderBottom(CellStyle.BORDER_THIN);
        titleStyle.setBorderLeft(CellStyle.BORDER_THIN);
        titleStyle.setBorderRight(CellStyle.BORDER_THIN);
        titleStyle.setBorderTop(CellStyle.BORDER_THIN);
        titleStyle.setAlignment(CellStyle.ALIGN_CENTER);
        // 生成一个字体
        Font titleFont = workbook.createFont();
        titleFont.setColor(IndexedColors.VIOLET.getIndex());
        titleFont.setFontHeightInPoints((short) 12);
        titleFont.setBoldweight(Font.BOLDWEIGHT_BOLD);
        // 把字体应用到当前的样式
        titleStyle.setFont(titleFont);
        // 生成并设置另一个样式
        cellStyle = workbook.createCellStyle();
        cellStyle.setFillForegroundColor(IndexedColors.LIGHT_YELLOW.getIndex());
        cellStyle.setFillPattern(CellStyle.SOLID_FOREGROUND);
        cellStyle.setBorderBottom(CellStyle.BORDER_THIN);
        cellStyle.setBorderLeft(CellStyle.BORDER_THIN);
        cellStyle.setBorderRight(CellStyle.BORDER_THIN);
        cellStyle.setBorderTop(CellStyle.BORDER_THIN);
        cellStyle.setAlignment(CellStyle.ALIGN_CENTER);
        cellStyle.setVerticalAlignment(CellStyle.VERTICAL_CENTER);
        // 生成另一个字体
        Font cellFont = workbook.createFont();
        cellFont.setBoldweight(Font.BOLDWEIGHT_NORMAL);
        // 把字体应用到当前的样式
        cellStyle.setFont(cellFont);

        strCellfont = workbook.createFont();
        strCellfont.setColor(IndexedColors.BLUE.getIndex());
    }

    public ExportExcel() {
        this("sheet1");
    }

    private RichTextString createRichTextString(String str) {
        if (useNewVersion) {
            return new XSSFRichTextString(str);
        } else {
            return new HSSFRichTextString(str);
        }
    }

    public void addHeader(String[] headers) {
        // 产生表格标题行
        Row row = sheet.createRow(rowNum++);
        for (short i = 0; i < headers.length; i++) {
            Cell cell = row.createCell(i);
            cell.setCellStyle(titleStyle);
            RichTextString text = createRichTextString(headers[i]);
            cell.setCellValue(text);
        }
    }

    public void addRow(Object... objects) {
        Row row = sheet.createRow(rowNum++);

        for (int i = 0; i < objects.length; i++) {
            // 判断值的类型后进行强制类型
            Object value = objects[i];
            Cell cell = row.createCell(i);
            cell.setCellStyle(cellStyle);
            if (value == null)
                continue;
            if (value instanceof String) {
                RichTextString richString = createRichTextString((String) value);
                richString.applyFont(strCellfont);
                cell.setCellValue(richString);
            } else if (value instanceof Double) {
                double dValue = (Double) value;
                cell.setCellValue(dValue);
            } else if (value instanceof Boolean) {
                boolean bValue = (Boolean) value;
                cell.setCellValue(bValue);
            } else if (value instanceof Integer) {
                int intValue = (Integer) value;
                cell.setCellValue(intValue);
            } else if (value instanceof Float) {
                float fValue = (Float) value;
                cell.setCellValue(fValue);
            } else if (value instanceof Long) {
                long longValue = (Long) value;
                cell.setCellValue(longValue);
            } else if (value instanceof Date) {
                Date date = (Date) value;
                cell.setCellValue(date);
            } else {
                RichTextString richString = createRichTextString(value.toString());
                richString.applyFont(strCellfont);
                cell.setCellValue(richString);
            }
        }
    }

    public void write(OutputStream out) throws IOException {
        workbook.write(out);
    }

    public String getFileSuffix() {
        if (useNewVersion) {
            return "xlsx";
        } else {
            return "xls";
        }
    }
}
