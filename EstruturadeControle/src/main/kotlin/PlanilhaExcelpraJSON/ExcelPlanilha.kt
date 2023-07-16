/*
package PlanilhaExcelpraJSON

import kotlinx.serialization.*
import kotlinx.serialization.json.Json
import org.apache.poi.ss.usermodel.*
import org.apache.poi.xssf.usermodel.XSSFWorkbook
import java.io.File

@Serializable
data class RowData(val column1: String, val column2: String, val column3: String)

fun main() {
    val workbook = XSSFWorkbook(File("caminho/para/arquivo.xlsx"))
    val sheet = workbook.getSheetAt(0)

    val rows = mutableListOf<RowData>()

    for (row in sheet) {
        val cell1 = row.getCell(0).stringCellValue
        val cell2 = row.getCell(1).stringCellValue
        val cell3 = row.getCell(2).stringCellValue

        val rowData = RowData(cell1, cell2, cell3)
        rows.add(rowData)
    }

    val json = Json.encodeToString(rows)
    println(json)

    workbook.close()
}
*/
