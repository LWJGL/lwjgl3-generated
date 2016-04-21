/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * Instances of this class may be set to the {@code pfnInternalAllocation} member of the {@link VkAllocationCallbacks} struct.
 * 
 * <p>This is a purely informational callback.</p>
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
		super(NULL);
		address = VkInternalAllocationNotificationI.super.address();
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