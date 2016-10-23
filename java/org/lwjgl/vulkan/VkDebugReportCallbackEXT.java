/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * Application-defined debug report callback function.
 * 
 * <h5>C Specification</h5>
 * 
 * <p>The prototype for the callback function implemented by the application is:</p>
 * 
 * <pre><code>typedef VkBool32 (VKAPI_PTR *PFN_vkDebugReportCallbackEXT)(
    VkDebugReportFlagsEXT                       flags,
    VkDebugReportObjectTypeEXT                  objectType,
    uint64_t                                    object,
    size_t                                      location,
    int32_t                                     messageCode,
    const char*                                 pLayerPrefix,
    const char*                                 pMessage,
    void*                                       pUserData);</code></pre>
 * 
 * <h5>Description</h5>
 * 
 * <p>The callback returns a {@code VkBool32} that indicates to the calling layer if the Vulkan call <b>should</b> be aborted or not. Applications <b>should</b> always return {@link VK10#VK_FALSE FALSE} so that they see the same behavior with and without validation layers enabled.</p>
 * 
 * <p>If the application returns {@link VK10#VK_TRUE TRUE} from its callback and the Vulkan call being aborted returns a {@code VkResult}, the layer will return {@link EXTDebugReport#VK_ERROR_VALIDATION_FAILED_EXT ERROR_VALIDATION_FAILED_EXT}.</p>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>The primary expected use of {@link EXTDebugReport#VK_ERROR_VALIDATION_FAILED_EXT ERROR_VALIDATION_FAILED_EXT} is for validation layer testing. It is not expected that an application would see this error code during normal use of the validation layers.</p>
 * </div>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkDebugReportCallbackCreateInfoEXT}</p>
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
		super(SIGNATURE);
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