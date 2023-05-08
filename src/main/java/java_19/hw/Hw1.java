package java_19.hw;

public class Hw1 {
    public static void main(String[] args) {
        /*
        Сформировать SQL запрос:  Вернуть все записи из cars, где параметры равны заданным, используя StringBuilder.
        Если значение null, то параметр не должен попадать в запрос.
        {"model", "V-60", "country", "Germany", "city", "Berlin", "year", null, "active", true}

        Примечание: Не думайте,о том как и в каком формате вы получаете данные на вход.

        Пример: {"id", 1, "country", null, "city", "Helsinki", "year", null}
        Результат: SELECT * FROM cars WHERE id = '1' AND city = 'Helsinki';
         */

        String table = "cars";
        String id = "1";
        String country = null;
        String city = "Helsinki";
        Integer year = null;
        Boolean active = true;

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SELECT");
        stringBuilder.append(" * ");
        stringBuilder.append("FROM ");
        stringBuilder.append(table);
        stringBuilder.append(" WHERE ");
        stringBuilder.append(id == null ? "" : "id = " + "'" + id + "'");
        stringBuilder.append(id != null ? " AND " : "");
        stringBuilder.append(country == null ? "" : "country = " + country);
        stringBuilder.append(country != null ? " AND " : "");
        stringBuilder.append(city == null ? "" : "city = " + "'" + city + "'");
        stringBuilder.append(city != null ? " AND " : "");
        stringBuilder.append(year == null ? "" : "year = " + "'" + year + "'");
        stringBuilder.append(year != null ? " AND " : "");
        stringBuilder.append(active == null ? "" : "active = " + "'" + active + "'");
        stringBuilder.append(";");

        System.out.println(stringBuilder);
    }
}
