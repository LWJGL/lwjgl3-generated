/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure containing callback function pointers for memory allocation.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code pfnAllocation} <b>must</b> be a valid pointer to a valid user-defined {@link VkAllocationFunction}</li>
 * <li>{@code pfnReallocation} <b>must</b> be a valid pointer to a valid user-defined {@link VkReallocationFunction}</li>
 * <li>{@code pfnFree} <b>must</b> be a valid pointer to a valid user-defined {@link VkFreeFunction}</li>
 * <li>If either of {@code pfnInternalAllocation} or {@code pfnInternalFree} is not {@code NULL}, both <b>must</b> be valid callbacks</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkAllocationFunction}, {@link VkFreeFunction}, {@link VkInternalAllocationNotification}, {@link VkInternalFreeNotification}, {@link VkReallocationFunction}, {@link VK10#vkAllocateMemory AllocateMemory}, {@link VK10#vkCreateBuffer CreateBuffer}, {@link VK10#vkCreateBufferView CreateBufferView}, {@link VK10#vkCreateCommandPool CreateCommandPool}, {@link VK10#vkCreateComputePipelines CreateComputePipelines}, {@link EXTDebugReport#vkCreateDebugReportCallbackEXT CreateDebugReportCallbackEXT}, {@link EXTDebugUtils#vkCreateDebugUtilsMessengerEXT CreateDebugUtilsMessengerEXT}, {@link VK10#vkCreateDescriptorPool CreateDescriptorPool}, {@link VK10#vkCreateDescriptorSetLayout CreateDescriptorSetLayout}, {@link VK11#vkCreateDescriptorUpdateTemplate CreateDescriptorUpdateTemplate}, {@link KHRDescriptorUpdateTemplate#vkCreateDescriptorUpdateTemplateKHR CreateDescriptorUpdateTemplateKHR}, {@link VK10#vkCreateDevice CreateDevice}, {@link KHRDisplay#vkCreateDisplayModeKHR CreateDisplayModeKHR}, {@link KHRDisplay#vkCreateDisplayPlaneSurfaceKHR CreateDisplayPlaneSurfaceKHR}, {@link VK10#vkCreateEvent CreateEvent}, {@link VK10#vkCreateFence CreateFence}, {@link VK10#vkCreateFramebuffer CreateFramebuffer}, {@link VK10#vkCreateGraphicsPipelines CreateGraphicsPipelines}, {@link VK10#vkCreateImage CreateImage}, {@link VK10#vkCreateImageView CreateImageView}, {@link NVXDeviceGeneratedCommands#vkCreateIndirectCommandsLayoutNVX CreateIndirectCommandsLayoutNVX}, {@link VK10#vkCreateInstance CreateInstance}, {@link MVKMacosSurface#vkCreateMacOSSurfaceMVK CreateMacOSSurfaceMVK}, {@link NVXDeviceGeneratedCommands#vkCreateObjectTableNVX CreateObjectTableNVX}, {@link VK10#vkCreatePipelineCache CreatePipelineCache}, {@link VK10#vkCreatePipelineLayout CreatePipelineLayout}, {@link VK10#vkCreateQueryPool CreateQueryPool}, {@link VK10#vkCreateRenderPass CreateRenderPass}, {@link VK10#vkCreateSampler CreateSampler}, {@link VK11#vkCreateSamplerYcbcrConversion CreateSamplerYcbcrConversion}, {@link KHRSamplerYcbcrConversion#vkCreateSamplerYcbcrConversionKHR CreateSamplerYcbcrConversionKHR}, {@link VK10#vkCreateSemaphore CreateSemaphore}, {@link VK10#vkCreateShaderModule CreateShaderModule}, {@link KHRDisplaySwapchain#vkCreateSharedSwapchainsKHR CreateSharedSwapchainsKHR}, {@link KHRSwapchain#vkCreateSwapchainKHR CreateSwapchainKHR}, {@link EXTValidationCache#vkCreateValidationCacheEXT CreateValidationCacheEXT}, {@link KHRWaylandSurface#vkCreateWaylandSurfaceKHR CreateWaylandSurfaceKHR}, {@link KHRWin32Surface#vkCreateWin32SurfaceKHR CreateWin32SurfaceKHR}, {@link KHRXlibSurface#vkCreateXlibSurfaceKHR CreateXlibSurfaceKHR}, {@link VK10#vkDestroyBuffer DestroyBuffer}, {@link VK10#vkDestroyBufferView DestroyBufferView}, {@link VK10#vkDestroyCommandPool DestroyCommandPool}, {@link EXTDebugReport#vkDestroyDebugReportCallbackEXT DestroyDebugReportCallbackEXT}, {@link EXTDebugUtils#vkDestroyDebugUtilsMessengerEXT DestroyDebugUtilsMessengerEXT}, {@link VK10#vkDestroyDescriptorPool DestroyDescriptorPool}, {@link VK10#vkDestroyDescriptorSetLayout DestroyDescriptorSetLayout}, {@link VK11#vkDestroyDescriptorUpdateTemplate DestroyDescriptorUpdateTemplate}, {@link KHRDescriptorUpdateTemplate#vkDestroyDescriptorUpdateTemplateKHR DestroyDescriptorUpdateTemplateKHR}, {@link VK10#vkDestroyDevice DestroyDevice}, {@link VK10#vkDestroyEvent DestroyEvent}, {@link VK10#vkDestroyFence DestroyFence}, {@link VK10#vkDestroyFramebuffer DestroyFramebuffer}, {@link VK10#vkDestroyImage DestroyImage}, {@link VK10#vkDestroyImageView DestroyImageView}, {@link NVXDeviceGeneratedCommands#vkDestroyIndirectCommandsLayoutNVX DestroyIndirectCommandsLayoutNVX}, {@link VK10#vkDestroyInstance DestroyInstance}, {@link NVXDeviceGeneratedCommands#vkDestroyObjectTableNVX DestroyObjectTableNVX}, {@link VK10#vkDestroyPipeline DestroyPipeline}, {@link VK10#vkDestroyPipelineCache DestroyPipelineCache}, {@link VK10#vkDestroyPipelineLayout DestroyPipelineLayout}, {@link VK10#vkDestroyQueryPool DestroyQueryPool}, {@link VK10#vkDestroyRenderPass DestroyRenderPass}, {@link VK10#vkDestroySampler DestroySampler}, {@link VK11#vkDestroySamplerYcbcrConversion DestroySamplerYcbcrConversion}, {@link KHRSamplerYcbcrConversion#vkDestroySamplerYcbcrConversionKHR DestroySamplerYcbcrConversionKHR}, {@link VK10#vkDestroySemaphore DestroySemaphore}, {@link VK10#vkDestroyShaderModule DestroyShaderModule}, {@link KHRSurface#vkDestroySurfaceKHR DestroySurfaceKHR}, {@link KHRSwapchain#vkDestroySwapchainKHR DestroySwapchainKHR}, {@link EXTValidationCache#vkDestroyValidationCacheEXT DestroyValidationCacheEXT}, {@link VK10#vkFreeMemory FreeMemory}, {@link EXTDisplayControl#vkRegisterDeviceEventEXT RegisterDeviceEventEXT}, {@link EXTDisplayControl#vkRegisterDisplayEventEXT RegisterDisplayEventEXT}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code pUserData} &ndash; a value to be interpreted by the implementation of the callbacks. When any of the callbacks in {@link VkAllocationCallbacks} are called, the Vulkan implementation will pass this value as the first parameter to the callback. This value <b>can</b> vary each time an allocator is passed into a command, even when the same object takes an allocator in multiple commands.</li>
 * <li>{@code pfnAllocation} &ndash; a pointer to an application-defined memory allocation function of type {@link VkAllocationFunction}.</li>
 * <li>{@code pfnReallocation} &ndash; a pointer to an application-defined memory reallocation function of type {@link VkReallocationFunction}.</li>
 * <li>{@code pfnFree} &ndash; a pointer to an application-defined memory free function of type {@link VkFreeFunction}.</li>
 * <li>{@code pfnInternalAllocation} &ndash; a pointer to an application-defined function that is called by the implementation when the implementation makes internal allocations, and it is of type {@link VkInternalAllocationNotification}.</li>
 * <li>{@code pfnInternalFree} &ndash; a pointer to an application-defined function that is called by the implementation when the implementation frees internal allocations, and it is of type {@link VkInternalFreeNotification}.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct VkAllocationCallbacks {
 *     void * pUserData;
 *     {@link VkAllocationFunctionI PFN_vkAllocationFunction} pfnAllocation;
 *     {@link VkReallocationFunctionI PFN_vkReallocationFunction} pfnReallocation;
 *     {@link VkFreeFunctionI PFN_vkFreeFunction} pfnFree;
 *     {@link VkInternalAllocationNotificationI PFN_vkInternalAllocationNotification} pfnInternalAllocation;
 *     {@link VkInternalFreeNotificationI PFN_vkInternalFreeNotification} pfnInternalFree;
 * }</pre></code>
 */
public class VkAllocationCallbacks extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        PUSERDATA,
        PFNALLOCATION,
        PFNREALLOCATION,
        PFNFREE,
        PFNINTERNALALLOCATION,
        PFNINTERNALFREE;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        PUSERDATA = layout.offsetof(0);
        PFNALLOCATION = layout.offsetof(1);
        PFNREALLOCATION = layout.offsetof(2);
        PFNFREE = layout.offsetof(3);
        PFNINTERNALALLOCATION = layout.offsetof(4);
        PFNINTERNALFREE = layout.offsetof(5);
    }

    VkAllocationCallbacks(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VkAllocationCallbacks} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkAllocationCallbacks(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code pUserData} field. */
    @NativeType("void *")
    public long pUserData() { return npUserData(address()); }
    /** Returns the value of the {@code pfnAllocation} field. */
    @NativeType("PFN_vkAllocationFunction")
    public VkAllocationFunction pfnAllocation() { return npfnAllocation(address()); }
    /** Returns the value of the {@code pfnReallocation} field. */
    @NativeType("PFN_vkReallocationFunction")
    public VkReallocationFunction pfnReallocation() { return npfnReallocation(address()); }
    /** Returns the value of the {@code pfnFree} field. */
    @NativeType("PFN_vkFreeFunction")
    public VkFreeFunction pfnFree() { return npfnFree(address()); }
    /** Returns the value of the {@code pfnInternalAllocation} field. */
    @Nullable
    @NativeType("PFN_vkInternalAllocationNotification")
    public VkInternalAllocationNotification pfnInternalAllocation() { return npfnInternalAllocation(address()); }
    /** Returns the value of the {@code pfnInternalFree} field. */
    @Nullable
    @NativeType("PFN_vkInternalFreeNotification")
    public VkInternalFreeNotification pfnInternalFree() { return npfnInternalFree(address()); }

    /** Sets the specified value to the {@code pUserData} field. */
    public VkAllocationCallbacks pUserData(@NativeType("void *") long value) { npUserData(address(), value); return this; }
    /** Sets the specified value to the {@code pfnAllocation} field. */
    public VkAllocationCallbacks pfnAllocation(@NativeType("PFN_vkAllocationFunction") VkAllocationFunctionI value) { npfnAllocation(address(), value); return this; }
    /** Sets the specified value to the {@code pfnReallocation} field. */
    public VkAllocationCallbacks pfnReallocation(@NativeType("PFN_vkReallocationFunction") VkReallocationFunctionI value) { npfnReallocation(address(), value); return this; }
    /** Sets the specified value to the {@code pfnFree} field. */
    public VkAllocationCallbacks pfnFree(@NativeType("PFN_vkFreeFunction") VkFreeFunctionI value) { npfnFree(address(), value); return this; }
    /** Sets the specified value to the {@code pfnInternalAllocation} field. */
    public VkAllocationCallbacks pfnInternalAllocation(@Nullable @NativeType("PFN_vkInternalAllocationNotification") VkInternalAllocationNotificationI value) { npfnInternalAllocation(address(), value); return this; }
    /** Sets the specified value to the {@code pfnInternalFree} field. */
    public VkAllocationCallbacks pfnInternalFree(@Nullable @NativeType("PFN_vkInternalFreeNotification") VkInternalFreeNotificationI value) { npfnInternalFree(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkAllocationCallbacks set(
        long pUserData,
        VkAllocationFunctionI pfnAllocation,
        VkReallocationFunctionI pfnReallocation,
        VkFreeFunctionI pfnFree,
        VkInternalAllocationNotificationI pfnInternalAllocation,
        VkInternalFreeNotificationI pfnInternalFree
    ) {
        pUserData(pUserData);
        pfnAllocation(pfnAllocation);
        pfnReallocation(pfnReallocation);
        pfnFree(pfnFree);
        pfnInternalAllocation(pfnInternalAllocation);
        pfnInternalFree(pfnInternalFree);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkAllocationCallbacks set(VkAllocationCallbacks src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VkAllocationCallbacks} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkAllocationCallbacks malloc() {
        return create(nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link VkAllocationCallbacks} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkAllocationCallbacks calloc() {
        return create(nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link VkAllocationCallbacks} instance allocated with {@link BufferUtils}. */
    public static VkAllocationCallbacks create() {
        return new VkAllocationCallbacks(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link VkAllocationCallbacks} instance for the specified memory address. */
    public static VkAllocationCallbacks create(long address) {
        return new VkAllocationCallbacks(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkAllocationCallbacks createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Returns a new {@link VkAllocationCallbacks.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkAllocationCallbacks.Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkAllocationCallbacks.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkAllocationCallbacks.Buffer calloc(int capacity) {
        return create(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkAllocationCallbacks.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkAllocationCallbacks.Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link VkAllocationCallbacks.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkAllocationCallbacks.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkAllocationCallbacks.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VkAllocationCallbacks} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkAllocationCallbacks mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VkAllocationCallbacks} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkAllocationCallbacks callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VkAllocationCallbacks} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkAllocationCallbacks mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VkAllocationCallbacks} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkAllocationCallbacks callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkAllocationCallbacks.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkAllocationCallbacks.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkAllocationCallbacks.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkAllocationCallbacks.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkAllocationCallbacks.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkAllocationCallbacks.Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkAllocationCallbacks.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkAllocationCallbacks.Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #pUserData}. */
    public static long npUserData(long struct) { return memGetAddress(struct + VkAllocationCallbacks.PUSERDATA); }
    /** Unsafe version of {@link #pfnAllocation}. */
    public static VkAllocationFunction npfnAllocation(long struct) { return VkAllocationFunction.create(memGetAddress(struct + VkAllocationCallbacks.PFNALLOCATION)); }
    /** Unsafe version of {@link #pfnReallocation}. */
    public static VkReallocationFunction npfnReallocation(long struct) { return VkReallocationFunction.create(memGetAddress(struct + VkAllocationCallbacks.PFNREALLOCATION)); }
    /** Unsafe version of {@link #pfnFree}. */
    public static VkFreeFunction npfnFree(long struct) { return VkFreeFunction.create(memGetAddress(struct + VkAllocationCallbacks.PFNFREE)); }
    /** Unsafe version of {@link #pfnInternalAllocation}. */
    @Nullable public static VkInternalAllocationNotification npfnInternalAllocation(long struct) { return VkInternalAllocationNotification.createSafe(memGetAddress(struct + VkAllocationCallbacks.PFNINTERNALALLOCATION)); }
    /** Unsafe version of {@link #pfnInternalFree}. */
    @Nullable public static VkInternalFreeNotification npfnInternalFree(long struct) { return VkInternalFreeNotification.createSafe(memGetAddress(struct + VkAllocationCallbacks.PFNINTERNALFREE)); }

    /** Unsafe version of {@link #pUserData(long) pUserData}. */
    public static void npUserData(long struct, long value) { memPutAddress(struct + VkAllocationCallbacks.PUSERDATA, value); }
    /** Unsafe version of {@link #pfnAllocation(VkAllocationFunctionI) pfnAllocation}. */
    public static void npfnAllocation(long struct, VkAllocationFunctionI value) { memPutAddress(struct + VkAllocationCallbacks.PFNALLOCATION, value.address()); }
    /** Unsafe version of {@link #pfnReallocation(VkReallocationFunctionI) pfnReallocation}. */
    public static void npfnReallocation(long struct, VkReallocationFunctionI value) { memPutAddress(struct + VkAllocationCallbacks.PFNREALLOCATION, value.address()); }
    /** Unsafe version of {@link #pfnFree(VkFreeFunctionI) pfnFree}. */
    public static void npfnFree(long struct, VkFreeFunctionI value) { memPutAddress(struct + VkAllocationCallbacks.PFNFREE, value.address()); }
    /** Unsafe version of {@link #pfnInternalAllocation(VkInternalAllocationNotificationI) pfnInternalAllocation}. */
    public static void npfnInternalAllocation(long struct, @Nullable VkInternalAllocationNotificationI value) { memPutAddress(struct + VkAllocationCallbacks.PFNINTERNALALLOCATION, memAddressSafe(value)); }
    /** Unsafe version of {@link #pfnInternalFree(VkInternalFreeNotificationI) pfnInternalFree}. */
    public static void npfnInternalFree(long struct, @Nullable VkInternalFreeNotificationI value) { memPutAddress(struct + VkAllocationCallbacks.PFNINTERNALFREE, memAddressSafe(value)); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + VkAllocationCallbacks.PFNALLOCATION));
        check(memGetAddress(struct + VkAllocationCallbacks.PFNREALLOCATION));
        check(memGetAddress(struct + VkAllocationCallbacks.PFNFREE));
    }

    /**
     * Calls {@link #validate(long)} for each struct contained in the specified struct array.
     *
     * @param array the struct array to validate
     * @param count the number of structs in {@code array}
     */
    public static void validate(long array, int count) {
        for (int i = 0; i < count; i++) {
            validate(array + i * SIZEOF);
        }
    }

    // -----------------------------------

    /** An array of {@link VkAllocationCallbacks} structs. */
    public static class Buffer extends StructBuffer<VkAllocationCallbacks, Buffer> implements NativeResource {

        /**
         * Creates a new {@link VkAllocationCallbacks.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkAllocationCallbacks#SIZEOF}, and its mark will be undefined.
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected Buffer newBufferInstance(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            return new Buffer(address, container, mark, pos, lim, cap);
        }

        @Override
        protected VkAllocationCallbacks newInstance(long address) {
            return new VkAllocationCallbacks(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code pUserData} field. */
        @NativeType("void *")
        public long pUserData() { return VkAllocationCallbacks.npUserData(address()); }
        /** Returns the value of the {@code pfnAllocation} field. */
        @NativeType("PFN_vkAllocationFunction")
        public VkAllocationFunction pfnAllocation() { return VkAllocationCallbacks.npfnAllocation(address()); }
        /** Returns the value of the {@code pfnReallocation} field. */
        @NativeType("PFN_vkReallocationFunction")
        public VkReallocationFunction pfnReallocation() { return VkAllocationCallbacks.npfnReallocation(address()); }
        /** Returns the value of the {@code pfnFree} field. */
        @NativeType("PFN_vkFreeFunction")
        public VkFreeFunction pfnFree() { return VkAllocationCallbacks.npfnFree(address()); }
        /** Returns the value of the {@code pfnInternalAllocation} field. */
        @Nullable
        @NativeType("PFN_vkInternalAllocationNotification")
        public VkInternalAllocationNotification pfnInternalAllocation() { return VkAllocationCallbacks.npfnInternalAllocation(address()); }
        /** Returns the value of the {@code pfnInternalFree} field. */
        @Nullable
        @NativeType("PFN_vkInternalFreeNotification")
        public VkInternalFreeNotification pfnInternalFree() { return VkAllocationCallbacks.npfnInternalFree(address()); }

        /** Sets the specified value to the {@code pUserData} field. */
        public VkAllocationCallbacks.Buffer pUserData(@NativeType("void *") long value) { VkAllocationCallbacks.npUserData(address(), value); return this; }
        /** Sets the specified value to the {@code pfnAllocation} field. */
        public VkAllocationCallbacks.Buffer pfnAllocation(@NativeType("PFN_vkAllocationFunction") VkAllocationFunctionI value) { VkAllocationCallbacks.npfnAllocation(address(), value); return this; }
        /** Sets the specified value to the {@code pfnReallocation} field. */
        public VkAllocationCallbacks.Buffer pfnReallocation(@NativeType("PFN_vkReallocationFunction") VkReallocationFunctionI value) { VkAllocationCallbacks.npfnReallocation(address(), value); return this; }
        /** Sets the specified value to the {@code pfnFree} field. */
        public VkAllocationCallbacks.Buffer pfnFree(@NativeType("PFN_vkFreeFunction") VkFreeFunctionI value) { VkAllocationCallbacks.npfnFree(address(), value); return this; }
        /** Sets the specified value to the {@code pfnInternalAllocation} field. */
        public VkAllocationCallbacks.Buffer pfnInternalAllocation(@Nullable @NativeType("PFN_vkInternalAllocationNotification") VkInternalAllocationNotificationI value) { VkAllocationCallbacks.npfnInternalAllocation(address(), value); return this; }
        /** Sets the specified value to the {@code pfnInternalFree} field. */
        public VkAllocationCallbacks.Buffer pfnInternalFree(@Nullable @NativeType("PFN_vkInternalFreeNotification") VkInternalFreeNotificationI value) { VkAllocationCallbacks.npfnInternalFree(address(), value); return this; }

    }

}