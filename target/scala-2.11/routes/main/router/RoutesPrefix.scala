
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Glen/Desktop/New folder/webca2part2/conf/routes
// @DATE:Fri Dec 16 18:15:44 GMT 2016


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
