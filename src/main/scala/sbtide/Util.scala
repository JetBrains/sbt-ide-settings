package sbtide

import sbt.{File, FileFilter}

/**
 * @author Nikolay Obedin
 * @since 2/13/15.
 */
object Util {

  case class AncestorFilter(descendants: File*) extends FileFilter {
    def accept(file: File): Boolean = {
      file.isDirectory && (for {
        descendant <- descendants
      } yield {
        var p = descendant
        while (p != null && p != file)
          p = p.getParentFile
        p == null
      }).forall(_ == true)
    }
  }
}
