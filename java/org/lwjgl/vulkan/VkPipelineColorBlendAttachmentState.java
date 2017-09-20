/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure specifying a pipeline color blend attachment state.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#features-features-dualSrcBlend">dual source blending</a> feature is not enabled, {@code srcColorBlendFactor} <b>must</b> not be {@link VK10#VK_BLEND_FACTOR_SRC1_COLOR BLEND_FACTOR_SRC1_COLOR}, {@link VK10#VK_BLEND_FACTOR_ONE_MINUS_SRC1_COLOR BLEND_FACTOR_ONE_MINUS_SRC1_COLOR}, {@link VK10#VK_BLEND_FACTOR_SRC1_ALPHA BLEND_FACTOR_SRC1_ALPHA}, or {@link VK10#VK_BLEND_FACTOR_ONE_MINUS_SRC1_ALPHA BLEND_FACTOR_ONE_MINUS_SRC1_ALPHA}</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#features-features-dualSrcBlend">dual source blending</a> feature is not enabled, {@code dstColorBlendFactor} <b>must</b> not be {@link VK10#VK_BLEND_FACTOR_SRC1_COLOR BLEND_FACTOR_SRC1_COLOR}, {@link VK10#VK_BLEND_FACTOR_ONE_MINUS_SRC1_COLOR BLEND_FACTOR_ONE_MINUS_SRC1_COLOR}, {@link VK10#VK_BLEND_FACTOR_SRC1_ALPHA BLEND_FACTOR_SRC1_ALPHA}, or {@link VK10#VK_BLEND_FACTOR_ONE_MINUS_SRC1_ALPHA BLEND_FACTOR_ONE_MINUS_SRC1_ALPHA}</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#features-features-dualSrcBlend">dual source blending</a> feature is not enabled, {@code srcAlphaBlendFactor} <b>must</b> not be {@link VK10#VK_BLEND_FACTOR_SRC1_COLOR BLEND_FACTOR_SRC1_COLOR}, {@link VK10#VK_BLEND_FACTOR_ONE_MINUS_SRC1_COLOR BLEND_FACTOR_ONE_MINUS_SRC1_COLOR}, {@link VK10#VK_BLEND_FACTOR_SRC1_ALPHA BLEND_FACTOR_SRC1_ALPHA}, or {@link VK10#VK_BLEND_FACTOR_ONE_MINUS_SRC1_ALPHA BLEND_FACTOR_ONE_MINUS_SRC1_ALPHA}</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#features-features-dualSrcBlend">dual source blending</a> feature is not enabled, {@code dstAlphaBlendFactor} <b>must</b> not be {@link VK10#VK_BLEND_FACTOR_SRC1_COLOR BLEND_FACTOR_SRC1_COLOR}, {@link VK10#VK_BLEND_FACTOR_ONE_MINUS_SRC1_COLOR BLEND_FACTOR_ONE_MINUS_SRC1_COLOR}, {@link VK10#VK_BLEND_FACTOR_SRC1_ALPHA BLEND_FACTOR_SRC1_ALPHA}, or {@link VK10#VK_BLEND_FACTOR_ONE_MINUS_SRC1_ALPHA BLEND_FACTOR_ONE_MINUS_SRC1_ALPHA}</li>
 * <li>If either of {@code colorBlendOp} or {@code alphaBlendOp} is an <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#framebuffer-blend-advanced">advanced blend operation</a>, then {@code colorBlendOp} <b>must</b> equal {@code alphaBlendOp}</li>
 * <li>If {@link VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT}{@code ::advancedBlendIndependentBlend} is {@link VK10#VK_FALSE FALSE} and {@code colorBlendOp} is an <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#framebuffer-blend-advanced">advanced blend operation</a>, then {@code colorBlendOp} <b>must</b> be the same for all attachments.</li>
 * <li>If {@link VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT}{@code ::advancedBlendIndependentBlend} is {@link VK10#VK_FALSE FALSE} and {@code alphaBlendOp} is an <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#framebuffer-blend-advanced">advanced blend operation</a>, then {@code alphaBlendOp} <b>must</b> be the same for all attachments.</li>
 * <li>If {@link VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT}{@code ::advancedBlendAllOperations} is {@link VK10#VK_FALSE FALSE}, then {@code colorBlendOp} <b>must</b> not be {@link EXTBlendOperationAdvanced#VK_BLEND_OP_ZERO_EXT BLEND_OP_ZERO_EXT}, {@link EXTBlendOperationAdvanced#VK_BLEND_OP_SRC_EXT BLEND_OP_SRC_EXT}, {@link EXTBlendOperationAdvanced#VK_BLEND_OP_DST_EXT BLEND_OP_DST_EXT}, {@link EXTBlendOperationAdvanced#VK_BLEND_OP_SRC_OVER_EXT BLEND_OP_SRC_OVER_EXT}, {@link EXTBlendOperationAdvanced#VK_BLEND_OP_DST_OVER_EXT BLEND_OP_DST_OVER_EXT}, {@link EXTBlendOperationAdvanced#VK_BLEND_OP_SRC_IN_EXT BLEND_OP_SRC_IN_EXT}, {@link EXTBlendOperationAdvanced#VK_BLEND_OP_DST_IN_EXT BLEND_OP_DST_IN_EXT}, {@link EXTBlendOperationAdvanced#VK_BLEND_OP_SRC_OUT_EXT BLEND_OP_SRC_OUT_EXT}, {@link EXTBlendOperationAdvanced#VK_BLEND_OP_DST_OUT_EXT BLEND_OP_DST_OUT_EXT}, {@link EXTBlendOperationAdvanced#VK_BLEND_OP_SRC_ATOP_EXT BLEND_OP_SRC_ATOP_EXT}, {@link EXTBlendOperationAdvanced#VK_BLEND_OP_DST_ATOP_EXT BLEND_OP_DST_ATOP_EXT}, {@link EXTBlendOperationAdvanced#VK_BLEND_OP_XOR_EXT BLEND_OP_XOR_EXT}, {@link EXTBlendOperationAdvanced#VK_BLEND_OP_INVERT_EXT BLEND_OP_INVERT_EXT}, {@link EXTBlendOperationAdvanced#VK_BLEND_OP_INVERT_RGB_EXT BLEND_OP_INVERT_RGB_EXT}, {@link EXTBlendOperationAdvanced#VK_BLEND_OP_LINEARDODGE_EXT BLEND_OP_LINEARDODGE_EXT}, {@link EXTBlendOperationAdvanced#VK_BLEND_OP_LINEARBURN_EXT BLEND_OP_LINEARBURN_EXT}, {@link EXTBlendOperationAdvanced#VK_BLEND_OP_VIVIDLIGHT_EXT BLEND_OP_VIVIDLIGHT_EXT}, {@link EXTBlendOperationAdvanced#VK_BLEND_OP_LINEARLIGHT_EXT BLEND_OP_LINEARLIGHT_EXT}, {@link EXTBlendOperationAdvanced#VK_BLEND_OP_PINLIGHT_EXT BLEND_OP_PINLIGHT_EXT}, {@link EXTBlendOperationAdvanced#VK_BLEND_OP_HARDMIX_EXT BLEND_OP_HARDMIX_EXT}, {@link EXTBlendOperationAdvanced#VK_BLEND_OP_PLUS_EXT BLEND_OP_PLUS_EXT}, {@link EXTBlendOperationAdvanced#VK_BLEND_OP_PLUS_CLAMPED_EXT BLEND_OP_PLUS_CLAMPED_EXT}, {@link EXTBlendOperationAdvanced#VK_BLEND_OP_PLUS_CLAMPED_ALPHA_EXT BLEND_OP_PLUS_CLAMPED_ALPHA_EXT}, {@link EXTBlendOperationAdvanced#VK_BLEND_OP_PLUS_DARKER_EXT BLEND_OP_PLUS_DARKER_EXT}, {@link EXTBlendOperationAdvanced#VK_BLEND_OP_MINUS_EXT BLEND_OP_MINUS_EXT}, {@link EXTBlendOperationAdvanced#VK_BLEND_OP_MINUS_CLAMPED_EXT BLEND_OP_MINUS_CLAMPED_EXT}, {@link EXTBlendOperationAdvanced#VK_BLEND_OP_CONTRAST_EXT BLEND_OP_CONTRAST_EXT}, {@link EXTBlendOperationAdvanced#VK_BLEND_OP_INVERT_OVG_EXT BLEND_OP_INVERT_OVG_EXT}, {@link EXTBlendOperationAdvanced#VK_BLEND_OP_RED_EXT BLEND_OP_RED_EXT}, {@link EXTBlendOperationAdvanced#VK_BLEND_OP_GREEN_EXT BLEND_OP_GREEN_EXT}, or {@link EXTBlendOperationAdvanced#VK_BLEND_OP_BLUE_EXT BLEND_OP_BLUE_EXT}</li>
 * <li>If {@code colorBlendOp} or {@code alphaBlendOp} is an <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#framebuffer-blend-advanced">advanced blend operation</a>, then {@link VkSubpassDescription}{@code ::colorAttachmentCount} of the subpass this pipeline is compiled against <b>must</b> be less than or equal to {@link VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT}::advancedBlendMaxColorAttachments</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code srcColorBlendFactor} <b>must</b> be a valid {@code VkBlendFactor} value</li>
 * <li>{@code dstColorBlendFactor} <b>must</b> be a valid {@code VkBlendFactor} value</li>
 * <li>{@code colorBlendOp} <b>must</b> be a valid {@code VkBlendOp} value</li>
 * <li>{@code srcAlphaBlendFactor} <b>must</b> be a valid {@code VkBlendFactor} value</li>
 * <li>{@code dstAlphaBlendFactor} <b>must</b> be a valid {@code VkBlendFactor} value</li>
 * <li>{@code alphaBlendOp} <b>must</b> be a valid {@code VkBlendOp} value</li>
 * <li>{@code colorWriteMask} <b>must</b> be a valid combination of {@code VkColorComponentFlagBits} values</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkPipelineColorBlendStateCreateInfo}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code blendEnable} &ndash; controls whether blending is enabled for the corresponding color attachment. If blending is not enabled, the source fragment&#8217;s color for that attachment is passed through unmodified.</li>
 * <li>{@code srcColorBlendFactor} &ndash; selects which blend factor is used to determine the source factors <code>(S<sub>r</sub>,S<sub>g</sub>,S<sub>b</sub>)</code>.</li>
 * <li>{@code dstColorBlendFactor} &ndash; selects which blend factor is used to determine the destination factors <code>(D<sub>r</sub>,D<sub>g</sub>,D<sub>b</sub>)</code>.</li>
 * <li>{@code colorBlendOp} &ndash; selects which blend operation is used to calculate the RGB values to write to the color attachment.</li>
 * <li>{@code srcAlphaBlendFactor} &ndash; selects which blend factor is used to determine the source factor <code>S<sub>a</sub></code>.</li>
 * <li>{@code dstAlphaBlendFactor} &ndash; selects which blend factor is used to determine the destination factor <code>D<sub>a</sub></code>.</li>
 * <li>{@code alphaBlendOp} &ndash; selects which blend operation is use to calculate the alpha values to write to the color attachment.</li>
 * <li>{@code colorWriteMask} &ndash; a bitmask of {@code VkColorComponentFlagBits} specifying which of the R, G, B, and/or A components are enabled for writing, as described for the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#framebuffer-color-write-mask">Color Write Mask</a>.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct VkPipelineColorBlendAttachmentState {
 *     VkBool32 blendEnable;
 *     VkBlendFactor srcColorBlendFactor;
 *     VkBlendFactor dstColorBlendFactor;
 *     VkBlendOp colorBlendOp;
 *     VkBlendFactor srcAlphaBlendFactor;
 *     VkBlendFactor dstAlphaBlendFactor;
 *     VkBlendOp alphaBlendOp;
 *     VkColorComponentFlags colorWriteMask;
 * }</pre></code>
 */
public class VkPipelineColorBlendAttachmentState extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        BLENDENABLE,
        SRCCOLORBLENDFACTOR,
        DSTCOLORBLENDFACTOR,
        COLORBLENDOP,
        SRCALPHABLENDFACTOR,
        DSTALPHABLENDFACTOR,
        ALPHABLENDOP,
        COLORWRITEMASK;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        BLENDENABLE = layout.offsetof(0);
        SRCCOLORBLENDFACTOR = layout.offsetof(1);
        DSTCOLORBLENDFACTOR = layout.offsetof(2);
        COLORBLENDOP = layout.offsetof(3);
        SRCALPHABLENDFACTOR = layout.offsetof(4);
        DSTALPHABLENDFACTOR = layout.offsetof(5);
        ALPHABLENDOP = layout.offsetof(6);
        COLORWRITEMASK = layout.offsetof(7);
    }

    VkPipelineColorBlendAttachmentState(long address, ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VkPipelineColorBlendAttachmentState} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPipelineColorBlendAttachmentState(ByteBuffer container) {
        this(memAddress(container), checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code blendEnable} field. */
    @NativeType("VkBool32")
    public boolean blendEnable() { return nblendEnable(address()) != 0; }
    /** Returns the value of the {@code srcColorBlendFactor} field. */
    @NativeType("VkBlendFactor")
    public int srcColorBlendFactor() { return nsrcColorBlendFactor(address()); }
    /** Returns the value of the {@code dstColorBlendFactor} field. */
    @NativeType("VkBlendFactor")
    public int dstColorBlendFactor() { return ndstColorBlendFactor(address()); }
    /** Returns the value of the {@code colorBlendOp} field. */
    @NativeType("VkBlendOp")
    public int colorBlendOp() { return ncolorBlendOp(address()); }
    /** Returns the value of the {@code srcAlphaBlendFactor} field. */
    @NativeType("VkBlendFactor")
    public int srcAlphaBlendFactor() { return nsrcAlphaBlendFactor(address()); }
    /** Returns the value of the {@code dstAlphaBlendFactor} field. */
    @NativeType("VkBlendFactor")
    public int dstAlphaBlendFactor() { return ndstAlphaBlendFactor(address()); }
    /** Returns the value of the {@code alphaBlendOp} field. */
    @NativeType("VkBlendOp")
    public int alphaBlendOp() { return nalphaBlendOp(address()); }
    /** Returns the value of the {@code colorWriteMask} field. */
    @NativeType("VkColorComponentFlags")
    public int colorWriteMask() { return ncolorWriteMask(address()); }

    /** Sets the specified value to the {@code blendEnable} field. */
    public VkPipelineColorBlendAttachmentState blendEnable(@NativeType("VkBool32") boolean value) { nblendEnable(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code srcColorBlendFactor} field. */
    public VkPipelineColorBlendAttachmentState srcColorBlendFactor(@NativeType("VkBlendFactor") int value) { nsrcColorBlendFactor(address(), value); return this; }
    /** Sets the specified value to the {@code dstColorBlendFactor} field. */
    public VkPipelineColorBlendAttachmentState dstColorBlendFactor(@NativeType("VkBlendFactor") int value) { ndstColorBlendFactor(address(), value); return this; }
    /** Sets the specified value to the {@code colorBlendOp} field. */
    public VkPipelineColorBlendAttachmentState colorBlendOp(@NativeType("VkBlendOp") int value) { ncolorBlendOp(address(), value); return this; }
    /** Sets the specified value to the {@code srcAlphaBlendFactor} field. */
    public VkPipelineColorBlendAttachmentState srcAlphaBlendFactor(@NativeType("VkBlendFactor") int value) { nsrcAlphaBlendFactor(address(), value); return this; }
    /** Sets the specified value to the {@code dstAlphaBlendFactor} field. */
    public VkPipelineColorBlendAttachmentState dstAlphaBlendFactor(@NativeType("VkBlendFactor") int value) { ndstAlphaBlendFactor(address(), value); return this; }
    /** Sets the specified value to the {@code alphaBlendOp} field. */
    public VkPipelineColorBlendAttachmentState alphaBlendOp(@NativeType("VkBlendOp") int value) { nalphaBlendOp(address(), value); return this; }
    /** Sets the specified value to the {@code colorWriteMask} field. */
    public VkPipelineColorBlendAttachmentState colorWriteMask(@NativeType("VkColorComponentFlags") int value) { ncolorWriteMask(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkPipelineColorBlendAttachmentState set(
        boolean blendEnable,
        int srcColorBlendFactor,
        int dstColorBlendFactor,
        int colorBlendOp,
        int srcAlphaBlendFactor,
        int dstAlphaBlendFactor,
        int alphaBlendOp,
        int colorWriteMask
    ) {
        blendEnable(blendEnable);
        srcColorBlendFactor(srcColorBlendFactor);
        dstColorBlendFactor(dstColorBlendFactor);
        colorBlendOp(colorBlendOp);
        srcAlphaBlendFactor(srcAlphaBlendFactor);
        dstAlphaBlendFactor(dstAlphaBlendFactor);
        alphaBlendOp(alphaBlendOp);
        colorWriteMask(colorWriteMask);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPipelineColorBlendAttachmentState set(VkPipelineColorBlendAttachmentState src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VkPipelineColorBlendAttachmentState} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPipelineColorBlendAttachmentState malloc() {
        return create(nmemAlloc(SIZEOF));
    }

    /** Returns a new {@link VkPipelineColorBlendAttachmentState} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPipelineColorBlendAttachmentState calloc() {
        return create(nmemCalloc(1, SIZEOF));
    }

    /** Returns a new {@link VkPipelineColorBlendAttachmentState} instance allocated with {@link BufferUtils}. */
    public static VkPipelineColorBlendAttachmentState create() {
        return new VkPipelineColorBlendAttachmentState(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link VkPipelineColorBlendAttachmentState} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
    public static VkPipelineColorBlendAttachmentState create(long address) {
        return address == NULL ? null : new VkPipelineColorBlendAttachmentState(address, null);
    }

    /**
     * Returns a new {@link VkPipelineColorBlendAttachmentState.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineColorBlendAttachmentState.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer calloc(int capacity) {
        return create(nmemCalloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineColorBlendAttachmentState.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link VkPipelineColorBlendAttachmentState.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Buffer create(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VkPipelineColorBlendAttachmentState} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkPipelineColorBlendAttachmentState mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VkPipelineColorBlendAttachmentState} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkPipelineColorBlendAttachmentState callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VkPipelineColorBlendAttachmentState} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineColorBlendAttachmentState mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VkPipelineColorBlendAttachmentState} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPipelineColorBlendAttachmentState callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPipelineColorBlendAttachmentState.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPipelineColorBlendAttachmentState.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPipelineColorBlendAttachmentState.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPipelineColorBlendAttachmentState.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #blendEnable}. */
    public static int nblendEnable(long struct) { return memGetInt(struct + VkPipelineColorBlendAttachmentState.BLENDENABLE); }
    /** Unsafe version of {@link #srcColorBlendFactor}. */
    public static int nsrcColorBlendFactor(long struct) { return memGetInt(struct + VkPipelineColorBlendAttachmentState.SRCCOLORBLENDFACTOR); }
    /** Unsafe version of {@link #dstColorBlendFactor}. */
    public static int ndstColorBlendFactor(long struct) { return memGetInt(struct + VkPipelineColorBlendAttachmentState.DSTCOLORBLENDFACTOR); }
    /** Unsafe version of {@link #colorBlendOp}. */
    public static int ncolorBlendOp(long struct) { return memGetInt(struct + VkPipelineColorBlendAttachmentState.COLORBLENDOP); }
    /** Unsafe version of {@link #srcAlphaBlendFactor}. */
    public static int nsrcAlphaBlendFactor(long struct) { return memGetInt(struct + VkPipelineColorBlendAttachmentState.SRCALPHABLENDFACTOR); }
    /** Unsafe version of {@link #dstAlphaBlendFactor}. */
    public static int ndstAlphaBlendFactor(long struct) { return memGetInt(struct + VkPipelineColorBlendAttachmentState.DSTALPHABLENDFACTOR); }
    /** Unsafe version of {@link #alphaBlendOp}. */
    public static int nalphaBlendOp(long struct) { return memGetInt(struct + VkPipelineColorBlendAttachmentState.ALPHABLENDOP); }
    /** Unsafe version of {@link #colorWriteMask}. */
    public static int ncolorWriteMask(long struct) { return memGetInt(struct + VkPipelineColorBlendAttachmentState.COLORWRITEMASK); }

    /** Unsafe version of {@link #blendEnable(boolean) blendEnable}. */
    public static void nblendEnable(long struct, int value) { memPutInt(struct + VkPipelineColorBlendAttachmentState.BLENDENABLE, value); }
    /** Unsafe version of {@link #srcColorBlendFactor(int) srcColorBlendFactor}. */
    public static void nsrcColorBlendFactor(long struct, int value) { memPutInt(struct + VkPipelineColorBlendAttachmentState.SRCCOLORBLENDFACTOR, value); }
    /** Unsafe version of {@link #dstColorBlendFactor(int) dstColorBlendFactor}. */
    public static void ndstColorBlendFactor(long struct, int value) { memPutInt(struct + VkPipelineColorBlendAttachmentState.DSTCOLORBLENDFACTOR, value); }
    /** Unsafe version of {@link #colorBlendOp(int) colorBlendOp}. */
    public static void ncolorBlendOp(long struct, int value) { memPutInt(struct + VkPipelineColorBlendAttachmentState.COLORBLENDOP, value); }
    /** Unsafe version of {@link #srcAlphaBlendFactor(int) srcAlphaBlendFactor}. */
    public static void nsrcAlphaBlendFactor(long struct, int value) { memPutInt(struct + VkPipelineColorBlendAttachmentState.SRCALPHABLENDFACTOR, value); }
    /** Unsafe version of {@link #dstAlphaBlendFactor(int) dstAlphaBlendFactor}. */
    public static void ndstAlphaBlendFactor(long struct, int value) { memPutInt(struct + VkPipelineColorBlendAttachmentState.DSTALPHABLENDFACTOR, value); }
    /** Unsafe version of {@link #alphaBlendOp(int) alphaBlendOp}. */
    public static void nalphaBlendOp(long struct, int value) { memPutInt(struct + VkPipelineColorBlendAttachmentState.ALPHABLENDOP, value); }
    /** Unsafe version of {@link #colorWriteMask(int) colorWriteMask}. */
    public static void ncolorWriteMask(long struct, int value) { memPutInt(struct + VkPipelineColorBlendAttachmentState.COLORWRITEMASK, value); }

    // -----------------------------------

    /** An array of {@link VkPipelineColorBlendAttachmentState} structs. */
    public static class Buffer extends StructBuffer<VkPipelineColorBlendAttachmentState, Buffer> implements NativeResource {

        /**
         * Creates a new {@link VkPipelineColorBlendAttachmentState.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPipelineColorBlendAttachmentState#SIZEOF}, and its mark will be undefined.
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
        protected VkPipelineColorBlendAttachmentState newInstance(long address) {
            return new VkPipelineColorBlendAttachmentState(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code blendEnable} field. */
        @NativeType("VkBool32")
        public boolean blendEnable() { return VkPipelineColorBlendAttachmentState.nblendEnable(address()) != 0; }
        /** Returns the value of the {@code srcColorBlendFactor} field. */
        @NativeType("VkBlendFactor")
        public int srcColorBlendFactor() { return VkPipelineColorBlendAttachmentState.nsrcColorBlendFactor(address()); }
        /** Returns the value of the {@code dstColorBlendFactor} field. */
        @NativeType("VkBlendFactor")
        public int dstColorBlendFactor() { return VkPipelineColorBlendAttachmentState.ndstColorBlendFactor(address()); }
        /** Returns the value of the {@code colorBlendOp} field. */
        @NativeType("VkBlendOp")
        public int colorBlendOp() { return VkPipelineColorBlendAttachmentState.ncolorBlendOp(address()); }
        /** Returns the value of the {@code srcAlphaBlendFactor} field. */
        @NativeType("VkBlendFactor")
        public int srcAlphaBlendFactor() { return VkPipelineColorBlendAttachmentState.nsrcAlphaBlendFactor(address()); }
        /** Returns the value of the {@code dstAlphaBlendFactor} field. */
        @NativeType("VkBlendFactor")
        public int dstAlphaBlendFactor() { return VkPipelineColorBlendAttachmentState.ndstAlphaBlendFactor(address()); }
        /** Returns the value of the {@code alphaBlendOp} field. */
        @NativeType("VkBlendOp")
        public int alphaBlendOp() { return VkPipelineColorBlendAttachmentState.nalphaBlendOp(address()); }
        /** Returns the value of the {@code colorWriteMask} field. */
        @NativeType("VkColorComponentFlags")
        public int colorWriteMask() { return VkPipelineColorBlendAttachmentState.ncolorWriteMask(address()); }

        /** Sets the specified value to the {@code blendEnable} field. */
        public VkPipelineColorBlendAttachmentState.Buffer blendEnable(@NativeType("VkBool32") boolean value) { VkPipelineColorBlendAttachmentState.nblendEnable(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code srcColorBlendFactor} field. */
        public VkPipelineColorBlendAttachmentState.Buffer srcColorBlendFactor(@NativeType("VkBlendFactor") int value) { VkPipelineColorBlendAttachmentState.nsrcColorBlendFactor(address(), value); return this; }
        /** Sets the specified value to the {@code dstColorBlendFactor} field. */
        public VkPipelineColorBlendAttachmentState.Buffer dstColorBlendFactor(@NativeType("VkBlendFactor") int value) { VkPipelineColorBlendAttachmentState.ndstColorBlendFactor(address(), value); return this; }
        /** Sets the specified value to the {@code colorBlendOp} field. */
        public VkPipelineColorBlendAttachmentState.Buffer colorBlendOp(@NativeType("VkBlendOp") int value) { VkPipelineColorBlendAttachmentState.ncolorBlendOp(address(), value); return this; }
        /** Sets the specified value to the {@code srcAlphaBlendFactor} field. */
        public VkPipelineColorBlendAttachmentState.Buffer srcAlphaBlendFactor(@NativeType("VkBlendFactor") int value) { VkPipelineColorBlendAttachmentState.nsrcAlphaBlendFactor(address(), value); return this; }
        /** Sets the specified value to the {@code dstAlphaBlendFactor} field. */
        public VkPipelineColorBlendAttachmentState.Buffer dstAlphaBlendFactor(@NativeType("VkBlendFactor") int value) { VkPipelineColorBlendAttachmentState.ndstAlphaBlendFactor(address(), value); return this; }
        /** Sets the specified value to the {@code alphaBlendOp} field. */
        public VkPipelineColorBlendAttachmentState.Buffer alphaBlendOp(@NativeType("VkBlendOp") int value) { VkPipelineColorBlendAttachmentState.nalphaBlendOp(address(), value); return this; }
        /** Sets the specified value to the {@code colorWriteMask} field. */
        public VkPipelineColorBlendAttachmentState.Buffer colorWriteMask(@NativeType("VkColorComponentFlags") int value) { VkPipelineColorBlendAttachmentState.ncolorWriteMask(address(), value); return this; }

    }

}