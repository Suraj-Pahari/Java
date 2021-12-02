<p align="right" ><i>26 Nov 2021 - 03 Dec 2021</i></p>
<h1 align="center"> Garbage Collection in java</h1>

## Introduction:
Garbage collection in Java refers to the deletion of all those objects that are no longer in use.In java,programmer doesn't need to take the responsibility for the both creation and destruction of object.Main objective of Garbage Collector is to free heap memory by destroying unreachable objects.


## Advantages:
- It makes java memory efficient because garbage collector removes the unreferenced objects from heap memory.
- It is automatically done by the garbage collector(a part of JVM) so we don't need to make extra efforts.

## Unreferenced object
Object that is eligible to be removed by garbage collector is termed as unreferenced object.Unreferenced object are made:
- By nulling the reference.
- By assigning refernce to another.
- By declaring anoymous object.

The finalize() method is invoked each time before the object is garbage collected.