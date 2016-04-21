/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * Instances of this class may be set to the {@code pfnInternalFree} member of the {@link VkAllocationCallbacks} struct.
 * 
 * <p>This is a purely informational callback.</p>
 */
public abstract class VkInternalFreeNotification extends Callback implements VkInternalFreeNotificationI {

	/** Creates a {@code VkInternalFreeNotification} instance from the specified function pointer. */
	public static VkInternalFreeNotification create(long functionPointer) {
		if ( functionPointer == NULL )
			return null;

		VkInternalFreeNotificationI instance = Callback.get(functionPointer);
		return instance instanceof VkInternalFreeNotification
			? (VkInternalFreeNotification)instance
			: new Container(functionPointer, instance);
	}

	/** Creates a {@code VkInternalFreeNotification} instance that delegates to the specified {@code VkInternalFreeNotificationI} instance. */
	public static VkInternalFreeNotification create(VkInternalFreeNotificationI instance) {
		return instance instanceof VkInternalFreeNotification
			? (VkInternalFreeNotification)instance
			: new Container(instance.address(), instance);
	}

	protected VkInternalFreeNotification() {
		super(NULL);
		address = VkInternalFreeNotificationI.super.address();
	}

	private VkInternalFreeNotification(long functionPointer) {
		super(functionPointer);
	}

	private static final class Container extends VkInternalFreeNotification {

		private final VkInternalFreeNotificationI delegate;

		Container(long functionPointer, VkInternalFreeNotificationI delegate) {
			super(functionPointer);
			this.delegate = delegate;
		}

		@Override
		public void invoke(long pUserData, long size, int allocationType, int allocationScope) {
			delegate.invoke(pUserData, size, allocationType, allocationScope);
		}

	}

}