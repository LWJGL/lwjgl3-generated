/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure specifying parameters of a newly created swapchain object.
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@code VkBool32}, {@code VkColorSpaceKHR}, {@code VkCompositeAlphaFlagBitsKHR}, {@link VkExtent2D}, {@code VkFormat}, {@code VkImageUsageFlags}, {@code VkPresentModeKHR}, {@code VkSharingMode}, {@code VkStructureType}, {@code VkSurfaceKHR}, {@code VkSurfaceTransformFlagBitsKHR}, {@code VkSwapchainCreateFlagsKHR}, {@code VkSwapchainKHR}, {@link KHRDisplaySwapchain#vkCreateSharedSwapchainsKHR CreateSharedSwapchainsKHR}, {@link KHRSwapchain#vkCreateSwapchainKHR CreateSwapchainKHR}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code flags} &ndash; a bitmask indicating parameters of swapchain creation. Bits which <b>can</b> be set include:
 * 
 * <code><pre>
 * typedef enum VkSwapchainCreateFlagBitsKHR {
 *     VK_SWAPCHAIN_CREATE_BIND_SFR_BIT_KHX = 0x00000001,
 * } VkSwapchainCreateFlagBitsKHR;</pre></code>
 * 
 * <p>== Description</p>
 * 
 * <p>If {@code flags} includes {@link KHXDeviceGroup#VK_SWAPCHAIN_CREATE_BIND_SFR_BIT_KHX SWAPCHAIN_CREATE_BIND_SFR_BIT_KHX}, then images created from the swapchain (i.e. with the {@code swapchain} member of {@link VkImageSwapchainCreateInfoKHX} set to this swapchain's handle) <b>must</b> use {@link KHXDeviceGroup#VK_IMAGE_CREATE_BIND_SFR_BIT_KHX IMAGE_CREATE_BIND_SFR_BIT_KHX}.</p></li>
 * <li>{@code surface} &ndash; the surface that the swapchain will present images to.</li>
 * <li>{@code minImageCount} &ndash; the minimum number of presentable images that the application needs. The platform will either create the swapchain with at least that many images, or will fail to create the swapchain.</li>
 * <li>{@code imageFormat} &ndash; a {@code VkFormat} that is valid for swapchains on the specified surface.</li>
 * <li>{@code imageColorSpace} &ndash; a {@code VkColorSpaceKHR} that is valid for swapchains on the specified surface.</li>
 * <li>{@code imageExtent} &ndash; the size (in pixels) of the swapchain. Behavior is platform-dependent when the image extent does not match the surface&#8217;s {@code currentExtent} as returned by {@link KHRSurface#vkGetPhysicalDeviceSurfaceCapabilitiesKHR GetPhysicalDeviceSurfaceCapabilitiesKHR}.</li>
 * <li>{@code imageArrayLayers} &ndash; the number of views in a multiview/stereo surface. For non-stereoscopic-3D applications, this value is 1.</li>
 * <li>{@code imageUsage} &ndash; a bitmask of {@code VkImageUsageFlagBits}, indicating how the application will use the swapchain&#8217;s presentable images.</li>
 * <li>{@code imageSharingMode} &ndash; the sharing mode used for the images of the swapchain.</li>
 * <li>{@code queueFamilyIndexCount} &ndash; the number of queue families having access to the images of the swapchain in case {@code imageSharingMode} is {@link VK10#VK_SHARING_MODE_CONCURRENT SHARING_MODE_CONCURRENT}.</li>
 * <li>{@code pQueueFamilyIndices} &ndash; an array of queue family indices having access to the images of the swapchain in case {@code imageSharingMode} is {@link VK10#VK_SHARING_MODE_CONCURRENT SHARING_MODE_CONCURRENT}.</li>
 * <li>{@code preTransform} &ndash; a bitmask of {@code VkSurfaceTransformFlagBitsKHR}, describing the transform, relative to the presentation engine&#8217;s natural orientation, applied to the image content prior to presentation. If it does not match the {@code currentTransform} value returned by {@link KHRSurface#vkGetPhysicalDeviceSurfaceCapabilitiesKHR GetPhysicalDeviceSurfaceCapabilitiesKHR}, the presentation engine will transform the image content as part of the presentation operation.</li>
 * <li>{@code compositeAlpha} &ndash; a bitmask of {@code VkCompositeAlphaFlagBitsKHR}, indicating the alpha compositing mode to use when this surface is composited together with other surfaces on certain window systems.</li>
 * <li>{@code presentMode} &ndash; the presentation mode the swapchain will use. A swapchain&#8217;s present mode determines how incoming present requests will be processed and queued internally.</li>
 * <li>{@code clipped} &ndash; indicates whether the Vulkan implementation is allowed to discard rendering operations that affect regions of the surface which are not visible.
 * 
 * <ul>
 * <li>If set to {@link VK10#VK_TRUE TRUE}, the presentable images associated with the swapchain <b>may</b> not own all of their pixels. Pixels in the presentable images that correspond to regions of the target surface obscured by another window on the desktop or subject to some other clipping mechanism will have undefined content when read back. Pixel shaders <b>may</b> not execute for these pixels, and thus any side affects they would have had will not occur.</li>
 * <li>If set to {@link VK10#VK_FALSE FALSE}, presentable images associated with the swapchain will own all the pixels they contain. Setting this value to {@link VK10#VK_TRUE TRUE} does not guarantee any clipping will occur, but allows more optimal presentation methods to be used on some platforms.</li>
 * </ul></li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct VkSwapchainCreateInfoKHR {
 *     VkStructureType sType;
 *     const void * pNext;
 *     VkSwapchainCreateFlagsKHR flags;
 *     VkSurfaceKHR surface;
 *     uint32_t minImageCount;
 *     VkFormat imageFormat;
 *     VkColorSpaceKHR imageColorSpace;
 *     {@link VkExtent2D VkExtent2D} imageExtent;
 *     uint32_t imageArrayLayers;
 *     VkImageUsageFlags imageUsage;
 *     VkSharingMode imageSharingMode;
 *     uint32_t queueFamilyIndexCount;
 *     const uint32_t * pQueueFamilyIndices;
 *     VkSurfaceTransformFlagBitsKHR preTransform;
 *     VkCompositeAlphaFlagBitsKHR compositeAlpha;
 *     VkPresentModeKHR presentMode;
 *     VkBool32 clipped;
 *     VkSwapchainKHR oldSwapchain;
 * }</pre></code>
 */
public class VkSwapchainCreateInfoKHR extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS,
        SURFACE,
        MINIMAGECOUNT,
        IMAGEFORMAT,
        IMAGECOLORSPACE,
        IMAGEEXTENT,
        IMAGEARRAYLAYERS,
        IMAGEUSAGE,
        IMAGESHARINGMODE,
        QUEUEFAMILYINDEXCOUNT,
        PQUEUEFAMILYINDICES,
        PRETRANSFORM,
        COMPOSITEALPHA,
        PRESENTMODE,
        CLIPPED,
        OLDSWAPCHAIN;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(8),
            __member(4),
            __member(4),
            __member(4),
            __member(VkExtent2D.SIZEOF, VkExtent2D.ALIGNOF),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(8)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        SURFACE = layout.offsetof(3);
        MINIMAGECOUNT = layout.offsetof(4);
        IMAGEFORMAT = layout.offsetof(5);
        IMAGECOLORSPACE = layout.offsetof(6);
        IMAGEEXTENT = layout.offsetof(7);
        IMAGEARRAYLAYERS = layout.offsetof(8);
        IMAGEUSAGE = layout.offsetof(9);
        IMAGESHARINGMODE = layout.offsetof(10);
        QUEUEFAMILYINDEXCOUNT = layout.offsetof(11);
        PQUEUEFAMILYINDICES = layout.offsetof(12);
        PRETRANSFORM = layout.offsetof(13);
        COMPOSITEALPHA = layout.offsetof(14);
        PRESENTMODE = layout.offsetof(15);
        CLIPPED = layout.offsetof(16);
        OLDSWAPCHAIN = layout.offsetof(17);
    }

    VkSwapchainCreateInfoKHR(long address, ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VkSwapchainCreateInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkSwapchainCreateInfoKHR(ByteBuffer container) {
        this(memAddress(container), checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code sType} field. */
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    public long pNext() { return npNext(address()); }
    /** Returns the value of the {@code flags} field. */
    public int flags() { return nflags(address()); }
    /** Returns the value of the {@code surface} field. */
    public long surface() { return nsurface(address()); }
    /** Returns the value of the {@code minImageCount} field. */
    public int minImageCount() { return nminImageCount(address()); }
    /** Returns the value of the {@code imageFormat} field. */
    public int imageFormat() { return nimageFormat(address()); }
    /** Returns the value of the {@code imageColorSpace} field. */
    public int imageColorSpace() { return nimageColorSpace(address()); }
    /** Returns a {@link VkExtent2D} view of the {@code imageExtent} field. */
    public VkExtent2D imageExtent() { return nimageExtent(address()); }
    /** Returns the value of the {@code imageArrayLayers} field. */
    public int imageArrayLayers() { return nimageArrayLayers(address()); }
    /** Returns the value of the {@code imageUsage} field. */
    public int imageUsage() { return nimageUsage(address()); }
    /** Returns the value of the {@code imageSharingMode} field. */
    public int imageSharingMode() { return nimageSharingMode(address()); }
    /** Returns the value of the {@code queueFamilyIndexCount} field. */
    public int queueFamilyIndexCount() { return nqueueFamilyIndexCount(address()); }
    /** Returns a {@link IntBuffer} view of the data pointed to by the {@code pQueueFamilyIndices} field. */
    public IntBuffer pQueueFamilyIndices() { return npQueueFamilyIndices(address()); }
    /** Returns the value of the {@code preTransform} field. */
    public int preTransform() { return npreTransform(address()); }
    /** Returns the value of the {@code compositeAlpha} field. */
    public int compositeAlpha() { return ncompositeAlpha(address()); }
    /** Returns the value of the {@code presentMode} field. */
    public int presentMode() { return npresentMode(address()); }
    /** Returns the value of the {@code clipped} field. */
    public boolean clipped() { return nclipped(address()) != 0; }
    /** Returns the value of the {@code oldSwapchain} field. */
    public long oldSwapchain() { return noldSwapchain(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkSwapchainCreateInfoKHR sType(int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkSwapchainCreateInfoKHR pNext(long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    public VkSwapchainCreateInfoKHR flags(int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@code surface} field. */
    public VkSwapchainCreateInfoKHR surface(long value) { nsurface(address(), value); return this; }
    /** Sets the specified value to the {@code minImageCount} field. */
    public VkSwapchainCreateInfoKHR minImageCount(int value) { nminImageCount(address(), value); return this; }
    /** Sets the specified value to the {@code imageFormat} field. */
    public VkSwapchainCreateInfoKHR imageFormat(int value) { nimageFormat(address(), value); return this; }
    /** Sets the specified value to the {@code imageColorSpace} field. */
    public VkSwapchainCreateInfoKHR imageColorSpace(int value) { nimageColorSpace(address(), value); return this; }
    /** Copies the specified {@link VkExtent2D} to the {@code imageExtent} field. */
    public VkSwapchainCreateInfoKHR imageExtent(VkExtent2D value) { nimageExtent(address(), value); return this; }
    /** Sets the specified value to the {@code imageArrayLayers} field. */
    public VkSwapchainCreateInfoKHR imageArrayLayers(int value) { nimageArrayLayers(address(), value); return this; }
    /** Sets the specified value to the {@code imageUsage} field. */
    public VkSwapchainCreateInfoKHR imageUsage(int value) { nimageUsage(address(), value); return this; }
    /** Sets the specified value to the {@code imageSharingMode} field. */
    public VkSwapchainCreateInfoKHR imageSharingMode(int value) { nimageSharingMode(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code pQueueFamilyIndices} field. */
    public VkSwapchainCreateInfoKHR pQueueFamilyIndices(IntBuffer value) { npQueueFamilyIndices(address(), value); return this; }
    /** Sets the specified value to the {@code preTransform} field. */
    public VkSwapchainCreateInfoKHR preTransform(int value) { npreTransform(address(), value); return this; }
    /** Sets the specified value to the {@code compositeAlpha} field. */
    public VkSwapchainCreateInfoKHR compositeAlpha(int value) { ncompositeAlpha(address(), value); return this; }
    /** Sets the specified value to the {@code presentMode} field. */
    public VkSwapchainCreateInfoKHR presentMode(int value) { npresentMode(address(), value); return this; }
    /** Sets the specified value to the {@code clipped} field. */
    public VkSwapchainCreateInfoKHR clipped(boolean value) { nclipped(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code oldSwapchain} field. */
    public VkSwapchainCreateInfoKHR oldSwapchain(long value) { noldSwapchain(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkSwapchainCreateInfoKHR set(
        int sType,
        long pNext,
        int flags,
        long surface,
        int minImageCount,
        int imageFormat,
        int imageColorSpace,
        VkExtent2D imageExtent,
        int imageArrayLayers,
        int imageUsage,
        int imageSharingMode,
        IntBuffer pQueueFamilyIndices,
        int preTransform,
        int compositeAlpha,
        int presentMode,
        boolean clipped,
        long oldSwapchain
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        surface(surface);
        minImageCount(minImageCount);
        imageFormat(imageFormat);
        imageColorSpace(imageColorSpace);
        imageExtent(imageExtent);
        imageArrayLayers(imageArrayLayers);
        imageUsage(imageUsage);
        imageSharingMode(imageSharingMode);
        pQueueFamilyIndices(pQueueFamilyIndices);
        preTransform(preTransform);
        compositeAlpha(compositeAlpha);
        presentMode(presentMode);
        clipped(clipped);
        oldSwapchain(oldSwapchain);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkSwapchainCreateInfoKHR set(VkSwapchainCreateInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VkSwapchainCreateInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkSwapchainCreateInfoKHR malloc() {
        return create(nmemAlloc(SIZEOF));
    }

    /** Returns a new {@link VkSwapchainCreateInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkSwapchainCreateInfoKHR calloc() {
        return create(nmemCalloc(1, SIZEOF));
    }

    /** Returns a new {@link VkSwapchainCreateInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkSwapchainCreateInfoKHR create() {
        return new VkSwapchainCreateInfoKHR(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link VkSwapchainCreateInfoKHR} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
    public static VkSwapchainCreateInfoKHR create(long address) {
        return address == NULL ? null : new VkSwapchainCreateInfoKHR(address, null);
    }

    /**
     * Returns a new {@link VkSwapchainCreateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer malloc(int capacity) {
        return create(nmemAlloc(capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSwapchainCreateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer calloc(int capacity) {
        return create(nmemCalloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSwapchainCreateInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer create(int capacity) {
        return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
    }

    /**
     * Create a {@link VkSwapchainCreateInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Buffer create(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VkSwapchainCreateInfoKHR} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkSwapchainCreateInfoKHR mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VkSwapchainCreateInfoKHR} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkSwapchainCreateInfoKHR callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VkSwapchainCreateInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSwapchainCreateInfoKHR mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VkSwapchainCreateInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSwapchainCreateInfoKHR callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkSwapchainCreateInfoKHR.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkSwapchainCreateInfoKHR.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkSwapchainCreateInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSwapchainCreateInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkSwapchainCreateInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkSwapchainCreateInfoKHR.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return memGetInt(struct + VkSwapchainCreateInfoKHR.FLAGS); }
    /** Unsafe version of {@link #surface}. */
    public static long nsurface(long struct) { return memGetLong(struct + VkSwapchainCreateInfoKHR.SURFACE); }
    /** Unsafe version of {@link #minImageCount}. */
    public static int nminImageCount(long struct) { return memGetInt(struct + VkSwapchainCreateInfoKHR.MINIMAGECOUNT); }
    /** Unsafe version of {@link #imageFormat}. */
    public static int nimageFormat(long struct) { return memGetInt(struct + VkSwapchainCreateInfoKHR.IMAGEFORMAT); }
    /** Unsafe version of {@link #imageColorSpace}. */
    public static int nimageColorSpace(long struct) { return memGetInt(struct + VkSwapchainCreateInfoKHR.IMAGECOLORSPACE); }
    /** Unsafe version of {@link #imageExtent}. */
    public static VkExtent2D nimageExtent(long struct) { return VkExtent2D.create(struct + VkSwapchainCreateInfoKHR.IMAGEEXTENT); }
    /** Unsafe version of {@link #imageArrayLayers}. */
    public static int nimageArrayLayers(long struct) { return memGetInt(struct + VkSwapchainCreateInfoKHR.IMAGEARRAYLAYERS); }
    /** Unsafe version of {@link #imageUsage}. */
    public static int nimageUsage(long struct) { return memGetInt(struct + VkSwapchainCreateInfoKHR.IMAGEUSAGE); }
    /** Unsafe version of {@link #imageSharingMode}. */
    public static int nimageSharingMode(long struct) { return memGetInt(struct + VkSwapchainCreateInfoKHR.IMAGESHARINGMODE); }
    /** Unsafe version of {@link #queueFamilyIndexCount}. */
    public static int nqueueFamilyIndexCount(long struct) { return memGetInt(struct + VkSwapchainCreateInfoKHR.QUEUEFAMILYINDEXCOUNT); }
    /** Unsafe version of {@link #pQueueFamilyIndices() pQueueFamilyIndices}. */
    public static IntBuffer npQueueFamilyIndices(long struct) { return memIntBuffer(memGetAddress(struct + VkSwapchainCreateInfoKHR.PQUEUEFAMILYINDICES), nqueueFamilyIndexCount(struct)); }
    /** Unsafe version of {@link #preTransform}. */
    public static int npreTransform(long struct) { return memGetInt(struct + VkSwapchainCreateInfoKHR.PRETRANSFORM); }
    /** Unsafe version of {@link #compositeAlpha}. */
    public static int ncompositeAlpha(long struct) { return memGetInt(struct + VkSwapchainCreateInfoKHR.COMPOSITEALPHA); }
    /** Unsafe version of {@link #presentMode}. */
    public static int npresentMode(long struct) { return memGetInt(struct + VkSwapchainCreateInfoKHR.PRESENTMODE); }
    /** Unsafe version of {@link #clipped}. */
    public static int nclipped(long struct) { return memGetInt(struct + VkSwapchainCreateInfoKHR.CLIPPED); }
    /** Unsafe version of {@link #oldSwapchain}. */
    public static long noldSwapchain(long struct) { return memGetLong(struct + VkSwapchainCreateInfoKHR.OLDSWAPCHAIN); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkSwapchainCreateInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkSwapchainCreateInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { memPutInt(struct + VkSwapchainCreateInfoKHR.FLAGS, value); }
    /** Unsafe version of {@link #surface(long) surface}. */
    public static void nsurface(long struct, long value) { memPutLong(struct + VkSwapchainCreateInfoKHR.SURFACE, value); }
    /** Unsafe version of {@link #minImageCount(int) minImageCount}. */
    public static void nminImageCount(long struct, int value) { memPutInt(struct + VkSwapchainCreateInfoKHR.MINIMAGECOUNT, value); }
    /** Unsafe version of {@link #imageFormat(int) imageFormat}. */
    public static void nimageFormat(long struct, int value) { memPutInt(struct + VkSwapchainCreateInfoKHR.IMAGEFORMAT, value); }
    /** Unsafe version of {@link #imageColorSpace(int) imageColorSpace}. */
    public static void nimageColorSpace(long struct, int value) { memPutInt(struct + VkSwapchainCreateInfoKHR.IMAGECOLORSPACE, value); }
    /** Unsafe version of {@link #imageExtent(VkExtent2D) imageExtent}. */
    public static void nimageExtent(long struct, VkExtent2D value) { memCopy(value.address(), struct + VkSwapchainCreateInfoKHR.IMAGEEXTENT, VkExtent2D.SIZEOF); }
    /** Unsafe version of {@link #imageArrayLayers(int) imageArrayLayers}. */
    public static void nimageArrayLayers(long struct, int value) { memPutInt(struct + VkSwapchainCreateInfoKHR.IMAGEARRAYLAYERS, value); }
    /** Unsafe version of {@link #imageUsage(int) imageUsage}. */
    public static void nimageUsage(long struct, int value) { memPutInt(struct + VkSwapchainCreateInfoKHR.IMAGEUSAGE, value); }
    /** Unsafe version of {@link #imageSharingMode(int) imageSharingMode}. */
    public static void nimageSharingMode(long struct, int value) { memPutInt(struct + VkSwapchainCreateInfoKHR.IMAGESHARINGMODE, value); }
    /** Sets the specified value to the {@code queueFamilyIndexCount} field of the specified {@code struct}. */
    public static void nqueueFamilyIndexCount(long struct, int value) { memPutInt(struct + VkSwapchainCreateInfoKHR.QUEUEFAMILYINDEXCOUNT, value); }
    /** Unsafe version of {@link #pQueueFamilyIndices(IntBuffer) pQueueFamilyIndices}. */
    public static void npQueueFamilyIndices(long struct, IntBuffer value) { memPutAddress(struct + VkSwapchainCreateInfoKHR.PQUEUEFAMILYINDICES, memAddressSafe(value)); nqueueFamilyIndexCount(struct, value == null ? 0 : value.remaining()); }
    /** Unsafe version of {@link #preTransform(int) preTransform}. */
    public static void npreTransform(long struct, int value) { memPutInt(struct + VkSwapchainCreateInfoKHR.PRETRANSFORM, value); }
    /** Unsafe version of {@link #compositeAlpha(int) compositeAlpha}. */
    public static void ncompositeAlpha(long struct, int value) { memPutInt(struct + VkSwapchainCreateInfoKHR.COMPOSITEALPHA, value); }
    /** Unsafe version of {@link #presentMode(int) presentMode}. */
    public static void npresentMode(long struct, int value) { memPutInt(struct + VkSwapchainCreateInfoKHR.PRESENTMODE, value); }
    /** Unsafe version of {@link #clipped(boolean) clipped}. */
    public static void nclipped(long struct, int value) { memPutInt(struct + VkSwapchainCreateInfoKHR.CLIPPED, value); }
    /** Unsafe version of {@link #oldSwapchain(long) oldSwapchain}. */
    public static void noldSwapchain(long struct, long value) { memPutLong(struct + VkSwapchainCreateInfoKHR.OLDSWAPCHAIN, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        if (nqueueFamilyIndexCount(struct) != 0) {
            check(memGetAddress(struct + VkSwapchainCreateInfoKHR.PQUEUEFAMILYINDICES));
        }
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

    /** An array of {@link VkSwapchainCreateInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkSwapchainCreateInfoKHR, Buffer> implements NativeResource {

        /**
         * Creates a new {@link VkSwapchainCreateInfoKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkSwapchainCreateInfoKHR#SIZEOF}, and its mark will be undefined.
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
        }

        Buffer(long address, ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected Buffer newBufferInstance(long address, ByteBuffer container, int mark, int pos, int lim, int cap) {
            return new Buffer(address, container, mark, pos, lim, cap);
        }

        @Override
        protected VkSwapchainCreateInfoKHR newInstance(long address) {
            return new VkSwapchainCreateInfoKHR(address, container);
        }

        @Override
        protected int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code sType} field. */
        public int sType() { return VkSwapchainCreateInfoKHR.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        public long pNext() { return VkSwapchainCreateInfoKHR.npNext(address()); }
        /** Returns the value of the {@code flags} field. */
        public int flags() { return VkSwapchainCreateInfoKHR.nflags(address()); }
        /** Returns the value of the {@code surface} field. */
        public long surface() { return VkSwapchainCreateInfoKHR.nsurface(address()); }
        /** Returns the value of the {@code minImageCount} field. */
        public int minImageCount() { return VkSwapchainCreateInfoKHR.nminImageCount(address()); }
        /** Returns the value of the {@code imageFormat} field. */
        public int imageFormat() { return VkSwapchainCreateInfoKHR.nimageFormat(address()); }
        /** Returns the value of the {@code imageColorSpace} field. */
        public int imageColorSpace() { return VkSwapchainCreateInfoKHR.nimageColorSpace(address()); }
        /** Returns a {@link VkExtent2D} view of the {@code imageExtent} field. */
        public VkExtent2D imageExtent() { return VkSwapchainCreateInfoKHR.nimageExtent(address()); }
        /** Returns the value of the {@code imageArrayLayers} field. */
        public int imageArrayLayers() { return VkSwapchainCreateInfoKHR.nimageArrayLayers(address()); }
        /** Returns the value of the {@code imageUsage} field. */
        public int imageUsage() { return VkSwapchainCreateInfoKHR.nimageUsage(address()); }
        /** Returns the value of the {@code imageSharingMode} field. */
        public int imageSharingMode() { return VkSwapchainCreateInfoKHR.nimageSharingMode(address()); }
        /** Returns the value of the {@code queueFamilyIndexCount} field. */
        public int queueFamilyIndexCount() { return VkSwapchainCreateInfoKHR.nqueueFamilyIndexCount(address()); }
        /** Returns a {@link IntBuffer} view of the data pointed to by the {@code pQueueFamilyIndices} field. */
        public IntBuffer pQueueFamilyIndices() { return VkSwapchainCreateInfoKHR.npQueueFamilyIndices(address()); }
        /** Returns the value of the {@code preTransform} field. */
        public int preTransform() { return VkSwapchainCreateInfoKHR.npreTransform(address()); }
        /** Returns the value of the {@code compositeAlpha} field. */
        public int compositeAlpha() { return VkSwapchainCreateInfoKHR.ncompositeAlpha(address()); }
        /** Returns the value of the {@code presentMode} field. */
        public int presentMode() { return VkSwapchainCreateInfoKHR.npresentMode(address()); }
        /** Returns the value of the {@code clipped} field. */
        public boolean clipped() { return VkSwapchainCreateInfoKHR.nclipped(address()) != 0; }
        /** Returns the value of the {@code oldSwapchain} field. */
        public long oldSwapchain() { return VkSwapchainCreateInfoKHR.noldSwapchain(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkSwapchainCreateInfoKHR.Buffer sType(int value) { VkSwapchainCreateInfoKHR.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkSwapchainCreateInfoKHR.Buffer pNext(long value) { VkSwapchainCreateInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        public VkSwapchainCreateInfoKHR.Buffer flags(int value) { VkSwapchainCreateInfoKHR.nflags(address(), value); return this; }
        /** Sets the specified value to the {@code surface} field. */
        public VkSwapchainCreateInfoKHR.Buffer surface(long value) { VkSwapchainCreateInfoKHR.nsurface(address(), value); return this; }
        /** Sets the specified value to the {@code minImageCount} field. */
        public VkSwapchainCreateInfoKHR.Buffer minImageCount(int value) { VkSwapchainCreateInfoKHR.nminImageCount(address(), value); return this; }
        /** Sets the specified value to the {@code imageFormat} field. */
        public VkSwapchainCreateInfoKHR.Buffer imageFormat(int value) { VkSwapchainCreateInfoKHR.nimageFormat(address(), value); return this; }
        /** Sets the specified value to the {@code imageColorSpace} field. */
        public VkSwapchainCreateInfoKHR.Buffer imageColorSpace(int value) { VkSwapchainCreateInfoKHR.nimageColorSpace(address(), value); return this; }
        /** Copies the specified {@link VkExtent2D} to the {@code imageExtent} field. */
        public VkSwapchainCreateInfoKHR.Buffer imageExtent(VkExtent2D value) { VkSwapchainCreateInfoKHR.nimageExtent(address(), value); return this; }
        /** Sets the specified value to the {@code imageArrayLayers} field. */
        public VkSwapchainCreateInfoKHR.Buffer imageArrayLayers(int value) { VkSwapchainCreateInfoKHR.nimageArrayLayers(address(), value); return this; }
        /** Sets the specified value to the {@code imageUsage} field. */
        public VkSwapchainCreateInfoKHR.Buffer imageUsage(int value) { VkSwapchainCreateInfoKHR.nimageUsage(address(), value); return this; }
        /** Sets the specified value to the {@code imageSharingMode} field. */
        public VkSwapchainCreateInfoKHR.Buffer imageSharingMode(int value) { VkSwapchainCreateInfoKHR.nimageSharingMode(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code pQueueFamilyIndices} field. */
        public VkSwapchainCreateInfoKHR.Buffer pQueueFamilyIndices(IntBuffer value) { VkSwapchainCreateInfoKHR.npQueueFamilyIndices(address(), value); return this; }
        /** Sets the specified value to the {@code preTransform} field. */
        public VkSwapchainCreateInfoKHR.Buffer preTransform(int value) { VkSwapchainCreateInfoKHR.npreTransform(address(), value); return this; }
        /** Sets the specified value to the {@code compositeAlpha} field. */
        public VkSwapchainCreateInfoKHR.Buffer compositeAlpha(int value) { VkSwapchainCreateInfoKHR.ncompositeAlpha(address(), value); return this; }
        /** Sets the specified value to the {@code presentMode} field. */
        public VkSwapchainCreateInfoKHR.Buffer presentMode(int value) { VkSwapchainCreateInfoKHR.npresentMode(address(), value); return this; }
        /** Sets the specified value to the {@code clipped} field. */
        public VkSwapchainCreateInfoKHR.Buffer clipped(boolean value) { VkSwapchainCreateInfoKHR.nclipped(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code oldSwapchain} field. */
        public VkSwapchainCreateInfoKHR.Buffer oldSwapchain(long value) { VkSwapchainCreateInfoKHR.noldSwapchain(address(), value); return this; }

    }

}