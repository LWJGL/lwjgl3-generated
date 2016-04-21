/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * Instances of this class may be set to the {@code pfnCallback} member of the {@link VkDebugReportCallbackCreateInfoEXT} struct.
 * 
 * <p>A callback will be made for issues that match any bit set in its flags. The callback will come directly from the component that detected the event,
 * unless some other layer intercepts the calls for its own purposes (filter them in different way, log to system error log, etc.) An application may
 * receive multiple callbacks if multiple {@code VkDebugReportCallbackEXT} objects were created. A callback will always be executed in the same thread as
 * the originating Vulkan call. A callback may be called from multiple threads simultaneously (if the application is making Vulkan calls from multiple
 * threads).</p>
 */
public abstract class VkDebugReportCallbackEXT extends Callback implements VkDebugReportCallbackEXTI {

	/** Creates a {@code VkDebugReportCallbackEXT} instance from the specified function pointer. */
	public static VkDebugReportCallbackEXT create(long functionPointer) {
		if ( functionPointer == NULL )
			return null;

		VkDebugReportCallbackEXTI instance = Callback.get(functionPointer);
		return instance instanceof VkDebugReportCallbackEXT
			? (VkDebugReportCallbackEXT)instance
			: new Container(functionPointer, instance);
	}

	/** Creates a {@code VkDebugReportCallbackEXT} instance that delegates to the specified {@code VkDebugReportCallbackEXTI} instance. */
	public static VkDebugReportCallbackEXT create(VkDebugReportCallbackEXTI instance) {
		return instance instanceof VkDebugReportCallbackEXT
			? (VkDebugReportCallbackEXT)instance
			: new Container(instance.address(), instance);
	}

	protected VkDebugReportCallbackEXT() {
		super(NULL);
		address = VkDebugReportCallbackEXTI.super.address();
	}

	private VkDebugReportCallbackEXT(long functionPointer) {
		super(functionPointer);
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

	private static final class Container extends VkDebugReportCallbackEXT {

		private final VkDebugReportCallbackEXTI delegate;

		Container(long functionPointer, VkDebugReportCallbackEXTI delegate) {
			super(functionPointer);
			this.delegate = delegate;
		}

		@Override
		public int invoke(int flags, int objectType, long object, long location, int messageCode, long pLayerPrefix, long pMessage, long pUserData) {
			return delegate.invoke(flags, objectType, object, location, messageCode, pLayerPrefix, pMessage, pUserData);
		}

	}

}