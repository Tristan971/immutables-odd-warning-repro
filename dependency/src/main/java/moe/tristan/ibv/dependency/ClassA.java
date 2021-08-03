package moe.tristan.ibv.dependency;

import org.immutables.value.Value.Immutable;

import moe.tristan.ibv.common.immutables.SomeInterface;

@Immutable
public interface ClassA extends SomeInterface {

    ImmutableClassB getTls();

}
