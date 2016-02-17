/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.libffi.*;

import static org.lwjgl.system.APIUtil.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.libffi.LibFFI.*;

/**  */
public abstract class VkDebugReportCallbackEXT extends Closure.I {

	private static final FFICIF        CIF  = apiClosureCIF();
	private static final PointerBuffer ARGS = apiClosureArgs(8);

	private static final long CLASSPATH = apiClosureText("org.lwjgl.vulkan.VkDebugReportCallbackEXT");

	static {
		prepareCIF(
			CALL_CONVENTION_SYSTEM,
			CIF, ffi_type_uint32,
			ARGS, ffi_type_uint32, ffi_type_sint32, ffi_type_uint64, ffi_type_pointer, ffi_type_sint32, ffi_type_pointer, ffi_type_pointer, ffi_type_pointer
		);
	}

	protected VkDebugReportCallbackEXT() {
		super(CIF, CLASSPATH);
	}

	/**
	 * Will be called from a libffi closure invocation. Decodes the arguments and passes them to {@link #invoke}.
	 *
	 * @param args pointer to an array of jvalues
	 */
	@Override
	protected int callback(long args) {
		return invoke(
			memGetInt(memGetAddress(POINTER_SIZE * 0 + args)),
			memGetInt(memGetAddress(POINTER_SIZE * 1 + args)),
			memGetLong(memGetAddress(POINTER_SIZE * 2 + args)),
			memGetAddress(memGetAddress(POINTER_SIZE * 3 + args)),
			memGetInt(memGetAddress(POINTER_SIZE * 4 + args)),
			memGetAddress(memGetAddress(POINTER_SIZE * 5 + args)),
			memGetAddress(memGetAddress(POINTER_SIZE * 6 + args)),
			memGetAddress(memGetAddress(POINTER_SIZE * 7 + args))
		);
	}


	public abstract int invoke(int flags, int objectType, long object, long location, int messageCode, long pLayerPrefix, long pMessage, long pUserData);

	/** A functional interface for {@link VkDebugReportCallbackEXT}. */
	public interface SAM {
		int invoke(int flags, int objectType, long object, long location, int messageCode, long pLayerPrefix, long pMessage, long pUserData);
	}

	/**
	 * Creates a {@link VkDebugReportCallbackEXT} that delegates the callback to the specified functional interface.
	 *
	 * @param sam the delegation target
	 *
	 * @return the {@link VkDebugReportCallbackEXT} instance
	 */
	public static VkDebugReportCallbackEXT create(final SAM sam) {
		return new VkDebugReportCallbackEXT() {
			@Override
			public int invoke(int flags, int objectType, long object, long location, int messageCode, long pLayerPrefix, long pMessage, long pUserData) {
				return sam.invoke(flags, objectType, object, location, messageCode, pLayerPrefix, pMessage, pUserData);
			}
		};
	}

}