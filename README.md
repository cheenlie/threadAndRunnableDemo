# threadAndRunnableDemo
Java提供了线程类Thread来创建多线程的程序。其实，创建线程与创建普通的类的对象的操作是一样的，而线程就是Thread类或其子类的实例对象。每个Thread对象描述了一个单独的线程。要产生一个线程，有两种方法：

◆需要从Java.lang.Thread类派生一个新的线程类，重载它的run()方法； 
◆实现Runnalbe接口，重载Runnalbe接口中的run()方法。
