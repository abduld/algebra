package algebra
package laws

import algebra.number._
import algebra.ring._

import algebra.std.bigInt._
import algebra.std.int._
import algebra.std.list._
import algebra.std.rat._
import algebra.std.set._
import algebra.std.string._

import org.typelevel.discipline.scalatest.Discipline
import org.scalatest.FunSuite

class LawTests extends FunSuite with Discipline {
  checkAll("String", GroupLaws[String].monoid)
  checkAll("List[Int]", GroupLaws[List[Int]].monoid)
  checkAll("Set[Int]", GroupLaws[Set[Int]].commutativeMonoid)

  checkAll("Int", OrderLaws[Int].order)
  checkAll("Int", RingLaws[Int].euclideanRing)

  checkAll("BigInt", OrderLaws[BigInt].order)
  checkAll("BigInt", BaseLaws[BigInt].signed)
  checkAll("BigInt", RingLaws[BigInt].euclideanRing)

  checkAll("Rat", OrderLaws[Rat].order)
  checkAll("Rat", BaseLaws[Rat].signed)
  checkAll("Rat", RingLaws[Rat].field)
}