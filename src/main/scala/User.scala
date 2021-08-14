class User(val name: String, val age: Int)

object User {
  def printUser(user: User): Unit = print(user.name + " " + user.age)
}
