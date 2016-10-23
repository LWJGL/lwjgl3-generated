/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * Application-defined memory allocation notification function.
 * 
 * <h5>C Specification</h5>
 * 
 * <p>The type of {@code pfnInternalAllocation} is:</p>
 * 
 * <pre><code>typedef void (VKAPI_PTR *PFN_vkInternalAllocationNotification)(
    void*                                       pUserData,
    size_t                                      size,
    VkInternalAllocationType                    allocationType,
    VkSystemAllocationScope                     allocationScope);</code></pre>
 * 
 * <h5>Description</h5>
 * 
 * <p>This is a purely informational callback.</p>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkAllocationCallbacks}</p>
 */
public abstract class VkInternalAllocationNotification extends Callback implements VkInternalAllocationNotificationI {

	/** Creates a {@code VkInternalAllocationNotification} instance from the specified function pointer. */
	public static VkInternalAllocationNotification create(long functionPointer) {
		if ( functionPointer == NULL )
			return null;

		VkInternalAllocationNotificationI instance = Callback.get(functionPointer);
		return instance instanceof VkInternalAllocationNotification
			? (VkInternalAllocationNotification)instance
			: new Container(functionPointer, instance);
	}

	/** Creates a {@code VkInternalAllocationNotification} instance that delegates to the specified {@code VkInternalAllocationNotificationI} instance. */
	public static VkInternalAllocationNotification create(VkInternalAllocationNotificationI instance) {
		return instance instanceof VkInternalAllocationNotification
			? (VkInternalAllocationNotification)instance
			: new Container(instance.address(), instance);
	}

	protected VkInternalAllocationNotification() {
		super(SIGNATURE);
	}

	private VkInternalAllocationNotification(long functionPointer) {
		super(functionPointer);
	}

	private static final class Container extends VkInternalAllocationNotification {

		private final VkInternalAllocationNotificationI delegate;

		Container(long functionPointer, VkInternalAllocationNotificationI delegate) {
			super(functionPointer);
			this.delegate = delegate;
		}

		@Override
		public void invoke(long pUserData, long size, int allocationType, int allocationScope) {
			delegate.invoke(pUserData, size, allocationType, allocationScope);
		}

	}

}