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
 * Instances of this interface may be set to the {@code pfnInternalFree} member of the {@link VkAllocationCallbacks} struct.
 * 
 * <p>This is a purely informational callback.</p>
 */
@FunctionalInterface
public interface VkInternalFreeNotification extends Callback.V {

	/** Creates a {@code VkInternalFreeNotification} instance from the specified function pointer. */
	static VkInternalFreeNotification create(long functionPointer) {
		return functionPointer == NULL ? null : new VkInternalFreeNotificationHandle(functionPointer, Callback.get(functionPointer));
	}

	/** Creates a {@code VkInternalFreeNotification} instance that delegates to the specified {@code VkInternalFreeNotification} instance. */
	static VkInternalFreeNotification create(VkInternalFreeNotification sam) {
		return new VkInternalFreeNotificationHandle(sam.address(), sam);
	}

	@Override
	default long address() {
		return Callback.create(this, "(ppii)v", true);
	}

	@Override
	default void callback(long args) {
		invoke(
			dcbArgPointer(args),
			dcbArgPointer(args),
			dcbArgInt(args),
			dcbArgInt(args)
		);
	}

	/**
	 * Will be called by the Vulkan implementation when an internal deallocation occurs.
	 *
	 * @param pUserData       the value specified for {@link VkAllocationCallbacks}{@code .pUserData} in the allocator specified by the application
	 * @param size            the requested size of an allocation
	 * @param allocationType  the requested type of an allocation
	 * @param allocationScope a {@code VkSystemAllocationScope} value specifying the scope of the lifetime of the allocation
	 */
	void invoke(long pUserData, long size, int allocationType, int allocationScope);

}

final class VkInternalFreeNotificationHandle extends Pointer.Default implements VkInternalFreeNotification {

	private final VkInternalFreeNotification delegate;

	VkInternalFreeNotificationHandle(long functionPointer, VkInternalFreeNotification delegate) {
		super(functionPointer);
		this.delegate = delegate;
	}

	@Override
	public void free() {
		Callback.free(address());
	}

	@Override
	public void invoke(long pUserData, long size, int allocationType, int allocationScope) {
		delegate.invoke(pUserData, size, allocationType, allocationScope);
	}

}