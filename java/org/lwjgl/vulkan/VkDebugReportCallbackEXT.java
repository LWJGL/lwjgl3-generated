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

/**
 * Instances of this interface may be set to the {@code pfnCallback} member of the {@link VkDebugReportCallbackCreateInfoEXT} struct.
 * 
 * <p>A callback will be made for issues that match any bit set in its flags. The callback will come directly from the component that detected the event,
 * unless some other layer intercepts the calls for its own purposes (filter them in different way, log to system error log, etc.) An application may
 * receive multiple callbacks if multiple {@code VkDebugReportCallbackEXT} objects were created. A callback will always be executed in the same thread as
 * the originating Vulkan call. A callback may be called from multiple threads simultaneously (if the application is making Vulkan calls from multiple
 * threads).</p>
 */
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

	/**
	 * Will be called by the Vulkan implementation for events of interest to the application.
	 *
	 * @param flags        indicates the {@code VkDebugReportFlagBitsEXT} that triggered this callback
	 * @param objectType   the type of object being used / created at the time the event was triggered.
	 * @param object       gives the object where the issue was detected. {@code object} may be {@link VK10#VK_NULL_HANDLE NULL_HANDLE} if there is no object associated with the event.
	 * @param location     location is a component (layer, driver, loader) defined value that indicates the "location" of the trigger. This is an optional value.
	 * @param messageCode  a layer defined value indicating what test triggered this callback
	 * @param pLayerPrefix abbreviation of the component making the callback
	 * @param pMessage     a null terminated string detailing the trigger conditions
	 * @param pUserData    the user data given when the {@code DebugReportCallback} was created
	 *
	 * @return a {@code VkBool32} that indicates to the calling layer if the Vulkan call should be aborted or not. Applications should always return {@link VK10#VK_FALSE FALSE} so that
	 *         they see the same behavior with and without validation layers enabled.
	 */
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

	/**
	 * Converts the specified {@link VkDebugReportCallbackEXT} argument to a String.
	 *
	 * <p>This method may only be used inside a {@code VkDebugReportCallbackEXT} invocation.</p>
	 *
	 * @param string the argument to decode
	 *
	 * @return the message as a String
	 */
	public static String getString(long string) {
		return memUTF8(string);
	}

	/** A functional interface for {@link VkDebugReportCallbackEXT}. */
	public interface SAMString {
		int invoke(int flags, int objectType, long object, long location, int messageCode, String pLayerPrefix, String pMessage, long pUserData);
	}

	/**
	 * Creates a {@link VkDebugReportCallbackEXT} that delegates the callback to the specified functional interface.
	 *
	 * @param sam the delegation target
	 *
	 * @return the {@link VkDebugReportCallbackEXT} instance
	 */
	public static VkDebugReportCallbackEXT createString(final SAMString sam) {
		return new VkDebugReportCallbackEXT() {
			@Override
			public int invoke(int flags, int objectType, long object, long location, int messageCode, long pLayerPrefix, long pMessage, long pUserData) {
				return sam.invoke(flags, objectType, object, location, messageCode, getString(pLayerPrefix), getString(pMessage), pUserData);
			}
		};
	}
	
}