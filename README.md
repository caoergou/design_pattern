# 设计模式学习笔记

- 开发环境：VS Code
- JDK版本：JDK 11
- 参考资料：《head first 设计模式》

# 学习进度

- [x] 策略模式

# keypoint
## 根本目的
   之所以使用设计模式，在于**降低系统维护成本**。      

   在开发某个新系统时，往往会快速迭代，更关注实现，追求效率最大，而不考虑代码的可维护性。   
   而随着系统的不断扩大，当面对更多新需求时，由于快速迭代过程中可能导致严重的代码耦合，使得代码任何一个小改动都可能改变很多其他代码，并随着而来大量潜在BUG，将成为传说中的`屎山代码`。
   使用设计模式在软件开发之初考虑到未来可能的变动，让代码之间形成高内聚，低耦合的特点。

## 设计原则

1. **封装变化**
   将系统中可能会变化的部分独立起来，以避免其他部分受到影响。
   好处：减少代码变动时造成的不经意影响，维持系统的稳定。
   也即，使得系统的某个部分的变化不会影响其他部分。

2. **针对接口编程**
   针对接口编程，而不是针对实现编程。
   - 反例1：使用`interface`关键词来指定对象的某个行为，由子类来实现该接口，确定具体的行为；
   > 坏处：这样当某个`interface`存在多个不同的实现时，即便这些实现可能会有较多的相似，但依然要重复实现多次，且当部分对象不需要某个行为时，仍然需要实现接口定义的行为，缺乏灵活性。
   - 反例2：使用抽象类`abstract`定义对象的行为，子类继承抽象类，可以对部分行为进行改写。
   > 坏处：同样，当某些子类不存在抽象类定义的行为，这个行为依然存在，存在潜在的风险。
   - 正例：使用接口将行为抽象
   > 具体的行为应该由实现了接口的类来实现，对象中引用这些类，来实现行为的多态。

3. **多用组合，少用继承**
   使用组合将*算法族*封装成类，而不是通过继承，可以让系统更具弹性，还能在运行时动态的改变行为。  
   前面所说的用接口将行为抽象，这些行为接口的具体实现就是算法族
