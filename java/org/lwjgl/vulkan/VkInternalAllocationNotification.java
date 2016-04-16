/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.dyncall.DynCallback.*;

/**
 * Instances of this interface may be set to the {@code pfnInternalAllocation} member of the {@link VkAllocationCallbacks} struct.
 * 
 * <p>This is a purely informational callback.</p>
 */
public abstract class VkInternalAllocationNotification extends Callback.V {

	private static final long CLASSPATH = apiCallbackText("org.lwjgl.vulkan.VkInternalAllocationNotification");

	protected VkInternalAllocationNotification() {
		super(CALL_CONVENTION_SYSTEM + "(ppii)v", CLASSPATH);
	}

	/**
	 * Will be called from native code. Decodes the arguments and passes them to {@link #invoke}.
	 *
	 * @param args pointer to an array of jvalues
	 */
	@Override
	protected void callback(long args) {
		invoke(
			dcbArgPointer(args),
			dcbArgPointer(args),
			dcbArgInt(args),
			dcbArgInt(args)
		);
	}

	/**
	 * Will be called by the Vulkan implementation when an internal allocation occurs.
	 *
	 * @param pUserData       the value specified for {@link VkAllocationCallbacks}{@code .pUserData} in the allocator specified by the application
	 * @param size            the requested size of an allocation
	 * @param allocationType  the requested type of an allocation
	 * @param allocationScope a {@code VkSystemAllocationScope} value specifying the scope of the lifetime of the allocation
	 */
	public abstract void invoke(long pUserData, long size, int allocationType, int allocationScope);

	/** A functional interface for {@link VkInternalAllocationNotification}. */
	public interface SAM {
		void invoke(long pUserData, long size, int allocationType, int allocationScope);
	}

	/**
	 * Creates a {@link VkInternalAllocationNotification} that delegates the callback to the specified functional interface.
	 *
	 * @param sam the delegation target
	 *
	 * @return the {@link VkInternalAllocationNotification} instance
	 */
	public static VkInternalAllocationNotification create(SAM sam) {
		return new VkInternalAllocationNotification() {
			@Override
			public void invoke(long pUserData, long size, int allocationType, int allocationScope) {
				sam.invoke(pUserData, size, allocationType, allocationScope);
			}
		};
	}

}