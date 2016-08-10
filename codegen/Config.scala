package demo
object Config{
  val url = "jdbc:mysql://localhost:3306/fb"
  val jdbcDriver =  "com.mysql.jdbc.Driver"
  val slickProfile = slick.driver.MySQLDriver
}
