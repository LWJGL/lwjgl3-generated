/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.lwjgl.system.*;

import static org.lwjgl.system.dyncall.DynCallback.*;

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
@FunctionalInterface
public interface VkDebugReportCallbackEXTI extends CallbackI.I {

	String SIGNATURE = Callback.__stdcall("(iilpippp)i");

	@Override
	default String getSignature() { return SIGNATURE; }

	@Override
	default int callback(long args) {
		return invoke(
			dcbArgInt(args),
			dcbArgInt(args),
			dcbArgLong(args),
			dcbArgPointer(args),
			dcbArgInt(args),
			dcbArgPointer(args),
			dcbArgPointer(args),
			dcbArgPointer(args)
		);
	}

	/**
	 * Application-defined debug report callback function.
	 *
	 * @param flags        indicates the {@code VkDebugReportFlagBitsEXT} that triggered this callback.
	 * @param objectType   a {@code VkDebugReportObjectTypeEXT} specifying the type of object being used or created at the time the event was triggered.
	 * @param object       gives the object where the issue was detected. {@code object} may be {@link #NULL_OBJECT} if there is no object associated with the event.
	 * @param location     a component (layer, driver, loader) defined value that indicates the <em>location</em> of the trigger. This is an optional value.
	 * @param messageCode  a layer-defined value indicating what test triggered this callback.
	 * @param pLayerPrefix the abbreviation of the component making the callback.
	 * @param pMessage     a null-terminated string detailing the trigger conditions.
	 * @param pUserData    the user data given when the DebugReportCallback was created.
	 */
	int invoke(int flags, int objectType, long object, long location, int messageCode, long pLayerPrefix, long pMessage, long pUserData);

}