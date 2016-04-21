/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/** Instances of this class may be set to the {@code pfnAllocation} member of the {@link VkAllocationCallbacks} struct. */
public abstract class VkAllocationFunction extends Callback implements VkAllocationFunctionI {

	/** Creates a {@code VkAllocationFunction} instance from the specified function pointer. */
	public static VkAllocationFunction create(long functionPointer) {
		if ( functionPointer == NULL )
			return null;

		VkAllocationFunctionI instance = Callback.get(functionPointer);
		return instance instanceof VkAllocationFunction
			? (VkAllocationFunction)instance
			: new Container(functionPointer, instance);
	}

	/** Creates a {@code VkAllocationFunction} instance that delegates to the specified {@code VkAllocationFunctionI} instance. */
	public static VkAllocationFunction create(VkAllocationFunctionI instance) {
		return instance instanceof VkAllocationFunction
			? (VkAllocationFunction)instance
			: new Container(instance.address(), instance);
	}

	protected VkAllocationFunction() {
		super(NULL);
		address = VkAllocationFunctionI.super.address();
	}

	private VkAllocationFunction(long functionPointer) {
		super(functionPointer);
	}

	private static final class Container extends VkAllocationFunction {

		private final VkAllocationFunctionI delegate;

		Container(long functionPointer, VkAllocationFunctionI delegate) {
			super(functionPointer);
			this.delegate = delegate;
		}

		@Override
		public long invoke(long pUserData, long size, long alignment, int allocationScope) {
			return delegate.invoke(pUserData, size, alignment, allocationScope);
		}

	}

}