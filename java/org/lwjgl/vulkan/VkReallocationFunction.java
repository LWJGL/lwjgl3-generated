/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * Instances of this class may be set to the {@code pfnReallocation} member of the {@link VkAllocationCallbacks} struct.
 * 
 * <p>The function must alter the size of the allocation {@code pOriginal}, either by shrinking or growing it, to accommodate the new size.</p>
 * 
 * <p>If {@code pOriginal} is {@code NULL}, then {@code pfnReallocation} <b>must</b> behave similarly to {@link VkAllocationFunction}. If size is zero, then
 * {@code pfnReallocation} must behave similarly to {@link VkFreeFunction}. The contents of the original allocation from bytes zero to
 * {@code min(original size, new size) − 1} <b>must</b> be preserved in the new allocation. If the new allocation is larger than the old allocation, then the
 * contents of the additional space are undefined. If {@code pOriginal} is non-{@code NULL}, alignment <b>must</b> be equal to the originally requested alignment. If
 * satisfying these requirements involves creating a new allocation, then the old allocation <b>must</b> be freed. If this function fails, it <b>must</b> return {@code NULL}
 * and not free the old allocation.</p>
 */
public abstract class VkReallocationFunction extends Callback implements VkReallocationFunctionI {

	/** Creates a {@code VkReallocationFunction} instance from the specified function pointer. */
	public static VkReallocationFunction create(long functionPointer) {
		if ( functionPointer == NULL )
			return null;

		VkReallocationFunctionI instance = Callback.get(functionPointer);
		return instance instanceof VkReallocationFunction
			? (VkReallocationFunction)instance
			: new Container(functionPointer, instance);
	}

	/** Creates a {@code VkReallocationFunction} instance that delegates to the specified {@code VkReallocationFunctionI} instance. */
	public static VkReallocationFunction create(VkReallocationFunctionI instance) {
		return instance instanceof VkReallocationFunction
			? (VkReallocationFunction)instance
			: new Container(instance.address(), instance);
	}

	protected VkReallocationFunction() {
		super(NULL);
		address = VkReallocationFunctionI.super.address();
	}

	private VkReallocationFunction(long functionPointer) {
		super(functionPointer);
	}

	private static final class Container extends VkReallocationFunction {

		private final VkReallocationFunctionI delegate;

		Container(long functionPointer, VkReallocationFunctionI delegate) {
			super(functionPointer);
			this.delegate = delegate;
		}

		@Override
		public long invoke(long pUserData, long pOriginal, long size, long alignment, int allocationScope) {
			return delegate.invoke(pUserData, pOriginal, size, alignment, allocationScope);
		}

	}

}