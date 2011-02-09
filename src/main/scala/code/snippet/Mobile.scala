package code.snippet

import scala.xml._
import net.liftweb.http._
import net.liftweb.common._

class Mobile {
  def render = {
    S.setDocType(Full("""<!DOCTYPE html PUBLIC "-//WAPFORUM//DTD XHTML Mobile 1.0//EN" "http://www.wapforum.org/DTD/xhtml-mobile10.dtd">"""))
    println("Set doctype")
    NodeSeq.Empty
  }
}
