/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * Instances of this class may be set to the {@code pfnFree} member of the {@link VkAllocationCallbacks} struct.
 * 
 * <p>{@code pMemory may} be {@code NULL}, which the callback <b>must</b> handle safely. If {@code pMemory} is non-{@code NULL}, it must be a pointer previously allocated by
 * {@code pfnAllocation} or {@code pfnReallocation} and must be freed by the function.</p>
 */
public abstract class VkFreeFunction extends Callback implements VkFreeFunctionI {

	/** Creates a {@code VkFreeFunction} instance from the specified function pointer. */
	public static VkFreeFunction create(long functionPointer) {
		if ( functionPointer == NULL )
			return null;

		VkFreeFunctionI instance = Callback.get(functionPointer);
		return instance instanceof VkFreeFunction
			? (VkFreeFunction)instance
			: new Container(functionPointer, instance);
	}

	/** Creates a {@code VkFreeFunction} instance that delegates to the specified {@code VkFreeFunctionI} instance. */
	public static VkFreeFunction create(VkFreeFunctionI instance) {
		return instance instanceof VkFreeFunction
			? (VkFreeFunction)instance
			: new Container(instance.address(), instance);
	}

	protected VkFreeFunction() {
		super(NULL);
		address = VkFreeFunctionI.super.address();
	}

	private VkFreeFunction(long functionPointer) {
		super(functionPointer);
	}

	private static final class Container extends VkFreeFunction {

		private final VkFreeFunctionI delegate;

		Container(long functionPointer, VkFreeFunctionI delegate) {
			super(functionPointer);
			this.delegate = delegate;
		}

		@Override
		public void invoke(long pUserData, long pMemory) {
			delegate.invoke(pUserData, pMemory);
		}

	}

}