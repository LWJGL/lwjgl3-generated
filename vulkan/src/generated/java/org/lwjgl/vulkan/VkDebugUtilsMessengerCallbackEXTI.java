/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.lwjgl.system.*;

import static org.lwjgl.system.dyncall.DynCallback.*;

/**
 * Application-defined debug messenger callback function.
 * 
 * <h5>C Specification</h5>
 * 
 * <p>The prototype for the {@link VkDebugUtilsMessengerCreateInfoEXT}{@code ::pfnUserCallback} function implemented by the application is:</p>
 * 
 * <code><pre>
 * typedef VkBool32 (VKAPI_PTR *PFN_vkDebugUtilsMessengerCallbackEXT)(
 *     VkDebugUtilsMessageSeverityFlagBitsEXT           messageSeverity,
 *     VkDebugUtilsMessageTypeFlagsEXT                  messageType,
 *     const VkDebugUtilsMessengerCallbackDataEXT*      pCallbackData,
 *     void*                                            pUserData);</pre></code>
 * 
 * <h5>Description</h5>
 * 
 * <p>The callback <b>must</b> not call {@link EXTDebugUtils#vkDestroyDebugUtilsMessengerEXT DestroyDebugUtilsMessengerEXT}.</p>
 * 
 * <p>The callback returns a {@code VkBool32}, which is interpreted in a layer-specified manner. The application <b>should</b> always return {@link VK10#VK_FALSE FALSE}. The {@link VK10#VK_TRUE TRUE} value is reserved for use in layer development.</p>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkDebugUtilsMessengerCreateInfoEXT}</p>
 */
@FunctionalInterface
@NativeType("PFN_vkDebugUtilsMessengerCallbackEXT")
public interface VkDebugUtilsMessengerCallbackEXTI extends CallbackI.I {

    String SIGNATURE = Callback.__stdcall("(iipp)i");

    @Override
    default String getSignature() { return SIGNATURE; }

    @Override
    default int callback(long args) {
        return invoke(
            dcbArgInt(args),
            dcbArgInt(args),
            dcbArgPointer(args),
            dcbArgPointer(args)
        );
    }

    /**
     * Application-defined debug messenger callback function.
     *
     * @param messageSeverity specifies the {@code VkDebugUtilsMessageSeverityFlagBitsEXT} that triggered this callback.
     * @param messageType     
     * @param pCallbackData   contains all the callback related data in the {@link VkDebugUtilsMessengerCallbackDataEXT} structure.
     * @param pUserData       the user data provided when the {@code VkDebugUtilsMessengerEXT} was created.
     */
    @NativeType("VkBool32") int invoke(@NativeType("VkDebugUtilsMessageSeverityFlagBitsEXT") int messageSeverity, @NativeType("VkDebugUtilsMessageTypeFlagsEXT") int messageType, @NativeType("VkDebugUtilsMessengerCallbackDataEXT const *") long pCallbackData, @NativeType("void *") long pUserData);

}