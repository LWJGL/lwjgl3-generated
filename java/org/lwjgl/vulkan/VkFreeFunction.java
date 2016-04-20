/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.dyncall.DynCallback.*;

/**
 * Instances of this interface may be set to the {@code pfnFree} member of the {@link VkAllocationCallbacks} struct.
 * 
 * <p>{@code pMemory may} be {@code NULL}, which the callback <b>must</b> handle safely. If {@code pMemory} is non-{@code NULL}, it must be a pointer previously allocated by
 * {@code pfnAllocation} or {@code pfnReallocation} and must be freed by the function.</p>
 */
@FunctionalInterface
public interface VkFreeFunction extends Callback.V {

	/** Creates a {@code VkFreeFunction} instance from the specified function pointer. */
	static VkFreeFunction create(long functionPointer) {
		return functionPointer == NULL ? null : new VkFreeFunctionHandle(functionPointer, Callback.get(functionPointer));
	}

	/** Creates a {@code VkFreeFunction} instance that delegates to the specified {@code VkFreeFunction} instance. */
	static VkFreeFunction create(VkFreeFunction sam) {
		return new VkFreeFunctionHandle(sam.address(), sam);
	}

	@Override
	default long address() {
		return Callback.create(this, "(pp)v", true);
	}

	@Override
	default void callback(long args) {
		invoke(
			dcbArgPointer(args),
			dcbArgPointer(args)
		);
	}

	/**
	 * Will be called by the Vulkan implementation to free memory.
	 *
	 * @param pUserData the value specified for {@link VkAllocationCallbacks}{@code .pUserData} in the allocator specified by the application
	 * @param pMemory   the allocation to be freed
	 */
	void invoke(long pUserData, long pMemory);

}

final class VkFreeFunctionHandle extends Pointer.Default implements VkFreeFunction {

	private final VkFreeFunction delegate;

	VkFreeFunctionHandle(long functionPointer, VkFreeFunction delegate) {
		super(functionPointer);
		this.delegate = delegate;
	}

	@Override
	public void free() {
		Callback.free(address());
	}

	@Override
	public void invoke(long pUserData, long pMemory) {
		delegate.invoke(pUserData, pMemory);
	}

}