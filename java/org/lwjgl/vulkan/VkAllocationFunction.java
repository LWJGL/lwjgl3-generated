/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.lwjgl.system.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.dyncall.DynCallback.*;

/** Instances of this interface may be set to the {@code pfnAllocation} member of the {@link VkAllocationCallbacks} struct. */
public abstract class VkAllocationFunction extends Callback.P {

	private static final long CLASSPATH = apiCallbackText("org.lwjgl.vulkan.VkAllocationFunction");

	protected VkAllocationFunction() {
		super(CALL_CONVENTION_SYSTEM + "(pppi)p", CLASSPATH);
	}

	/**
	 * Will be called from native code. Decodes the arguments and passes them to {@link #invoke}.
	 *
	 * @param args pointer to an array of jvalues
	 */
	@Override
	protected long callback(long args) {
		return invoke(
			dcbArgPointer(args),
			dcbArgPointer(args),
			dcbArgPointer(args),
			dcbArgInt(args)
		);
	}

	/**
	 * Will be called by the Vulkan implementation to allocate memory.
	 *
	 * @param pUserData       the value specified for {@link VkAllocationCallbacks}{@code .pUserData} in the allocator specified by the application
	 * @param size            the size in bytes of the requested allocation
	 * @param alignment       the requested alignment of the allocation in bytes and <b>must</b> be a power of two
	 * @param allocationScope a {@code VkSystemAllocationScope} value specifying the scope of the lifetime of the allocation
	 *
	 * @return <b>must</b> either return {@code NULL} (in case of allocation failure or if size is zero) or a valid pointer to a memory allocation containing at least size bytes, and
	 *         with the pointer value being a multiple of alignment.
	 */
	public abstract long invoke(long pUserData, long size, long alignment, int allocationScope);

	/** A functional interface for {@link VkAllocationFunction}. */
	public interface SAM {
		long invoke(long pUserData, long size, long alignment, int allocationScope);
	}

	/**
	 * Creates a {@link VkAllocationFunction} that delegates the callback to the specified functional interface.
	 *
	 * @param sam the delegation target
	 *
	 * @return the {@link VkAllocationFunction} instance
	 */
	public static VkAllocationFunction create(SAM sam) {
		return new VkAllocationFunction() {
			@Override
			public long invoke(long pUserData, long size, long alignment, int allocationScope) {
				return sam.invoke(pUserData, size, alignment, allocationScope);
			}
		};
	}

}