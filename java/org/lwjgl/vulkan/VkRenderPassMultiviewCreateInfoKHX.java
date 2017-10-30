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
 * Structure containing multiview info for all subpasses.
 * 
 * <h5>Description</h5>
 * 
 * <p>When a subpass uses a non-zero view mask, <em>multiview</em> functionality is considered to be enabled. Multiview is all-or-nothing for a render pass - that is, either all subpasses <b>must</b> have a non-zero view mask (though some subpasses <b>may</b> have only one view) or all <b>must</b> be zero. Multiview causes all drawing and clear commands in the subpass to behave as if they were broadcast to each view, where a view is represented by one layer of the framebuffer attachments. All draws and clears are broadcast to each <em>view index</em> whose bit is set in the view mask. The view index is provided in the {@code ViewIndex} shader input variable, and color, depth/stencil, and input attachments all read/write the layer of the framebuffer corresponding to the view index.</p>
 * 
 * <p>If the view mask is zero for all subpasses, multiview is considered to be disabled and all drawing commands execute normally, without this additional broadcasting.</p>
 * 
 * <p>Some implementations <b>may</b> not support multiview in conjunction with <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#features-features-multiview-gs">geometry shaders</a> or <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#features-features-multiview-tess">tessellation shaders</a>.</p>
 * 
 * <p>When multiview is enabled, the {@link KHXMultiview#VK_DEPENDENCY_VIEW_LOCAL_BIT_KHX DEPENDENCY_VIEW_LOCAL_BIT_KHX} bit in a dependency <b>can</b> be used to express a view-local dependency, meaning that each view in the destination subpass depends on a single view in the source subpass. Unlike pipeline barriers, a subpass dependency <b>can</b> potentially have a different view mask in the source subpass and the destination subpass. If the dependency is view-local, then each view (<code>dstView</code>) in the destination subpass depends on the view <code>dstView + pViewOffsets[dependency]</code> in the source subpass. If there is not such a view in the source subpass, then this dependency does not affect that view in the destination subpass. If the dependency is not view-local, then all views in the destination subpass depend on all views in the source subpass, and the view offset is ignored. A non-zero view offset is not allowed in a self-dependency.</p>
 * 
 * <p>The elements of {@code pCorrelationMasks} are a set of masks of views indicating that views in the same mask <b>may</b> exhibit spatial coherency between the views, making it more efficient to render them concurrently. Correlation masks <b>must</b> not have a functional effect on the results of the multiview rendering.</p>
 * 
 * <p>When multiview is enabled, at the beginning of each subpass all non-render pass state is undefined. In particular, each time {@link VK10#vkCmdBeginRenderPass CmdBeginRenderPass} or {@link VK10#vkCmdNextSubpass CmdNextSubpass} is called the graphics pipeline <b>must</b> be bound, any relevant descriptor sets or vertex/index buffers <b>must</b> be bound, and any relevant dynamic state or push constants <b>must</b> be set before they are used.</p>
 * 
 * <p>A multiview subpass <b>can</b> declare that its shaders will write per-view attributes for all views in a single invocation, by setting the {@link NVXMultiviewPerViewAttributes#VK_SUBPASS_DESCRIPTION_PER_VIEW_ATTRIBUTES_BIT_NVX SUBPASS_DESCRIPTION_PER_VIEW_ATTRIBUTES_BIT_NVX} bit in the subpass description. The only supported per-view attributes are position and viewport mask, and per-view position and viewport masks are written to output array variables decorated with {@code PositionPerViewNV} and {@code ViewportMaskPerViewNV}, respectively. If {@code VK_NV_viewport_array2} is not supported and enabled, {@code ViewportMaskPerViewNV} <b>must</b> not be used. Values written to elements of {@code PositionPerViewNV} and {@code ViewportMaskPerViewNV} <b>must</b> not depend on the {@code ViewIndex}. The shader <b>must</b> also write to an output variable decorated with {@code Position}, and the value written to {@code Position} <b>must</b> equal the value written to {@code PositionPerViewNV}[{@code ViewIndex}]. Similarly, if {@code ViewportMaskPerViewNV} is written to then the shader <b>must</b> also write to an output variable decorated with {@code ViewportMaskNV}, and the value written to {@code ViewportMaskNV} <b>must</b> equal the value written to {@code ViewportMaskPerViewNV}[{@code ViewIndex}]. Implementations will either use values taken from {@code Position} and {@code ViewportMaskNV} and invoke the shader once for each view, or will use values taken from {@code PositionPerViewNV} and {@code ViewportMaskPerViewNV} and invoke the shader fewer times. The values written to {@code Position} and {@code ViewportMaskNV} <b>must</b> not depend on the values written to {@code PositionPerViewNV} and {@code ViewportMaskPerViewNV}, or vice versa (to allow compilers to eliminate the unused outputs). All attributes that do not have *PerViewNV counterparts <b>must</b> not depend on {@code ViewIndex}.</p>
 * 
 * <p>Per-view attributes are all-or-nothing for a subpass. That is, all pipelines compiled against a subpass that includes the {@link NVXMultiviewPerViewAttributes#VK_SUBPASS_DESCRIPTION_PER_VIEW_ATTRIBUTES_BIT_NVX SUBPASS_DESCRIPTION_PER_VIEW_ATTRIBUTES_BIT_NVX} bit <b>must</b> write per-view attributes to the *PerViewNV[] shader outputs, in addition to the non-per-view (e.g. {@code Position}) outputs. Pipelines compiled against a subpass that does not include this bit <b>must</b> not include the *PerViewNV[] outputs in their interfaces.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>If {@code subpassCount} is not zero, {@code subpassCount} <b>must</b> be equal to the {@code subpassCount} in the {@link VkRenderPassCreateInfo} structure at the start of the chain</li>
 * <li>If {@code dependencyCount} is not zero, {@code dependencyCount} <b>must</b> be equal to the {@code dependencyCount} in the {@link VkRenderPassCreateInfo} structure at the start of the chain</li>
 * <li>Each view index <b>must</b> not be set in more than one element of {@code pCorrelationMasks}</li>
 * <li>If an element of {@code pViewOffsets} is non-zero, the corresponding {@link VkSubpassDependency} structure <b>must</b> have different values of {@code srcSubpass} and {@code dstSubpass}.</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHXMultiview#VK_STRUCTURE_TYPE_RENDER_PASS_MULTIVIEW_CREATE_INFO_KHX STRUCTURE_TYPE_RENDER_PASS_MULTIVIEW_CREATE_INFO_KHX}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>If {@code subpassCount} is not 0, {@code pViewMasks} <b>must</b> be a valid pointer to an array of {@code subpassCount} {@code uint32_t} values</li>
 * <li>If {@code dependencyCount} is not 0, {@code pViewOffsets} <b>must</b> be a valid pointer to an array of {@code dependencyCount} {@code int32_t} values</li>
 * <li>If {@code correlationMaskCount} is not 0, {@code pCorrelationMasks} <b>must</b> be a valid pointer to an array of {@code correlationMaskCount} {@code uint32_t} values</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code subpassCount} &ndash; zero or is the number of subpasses in the render pass.</li>
 * <li>{@code pViewMasks} &ndash; points to an array of {@code subpassCount} number of view masks, where each mask is a bitfield of view indices describing which views rendering is broadcast to in each subpass, when multiview is enabled. If {@code subpassCount} is zero, each view mask is treated as zero.</li>
 * <li>{@code dependencyCount} &ndash; zero or the number of dependencies in the render pass.</li>
 * <li>{@code pViewOffsets} &ndash; points to an array of {@code dependencyCount} view offsets, one for each dependency. If {@code dependencyCount} is zero, each dependency&#8217;s view offset is treated as zero. Each view offset controls which views in the source subpass the views in the destination subpass depend on.</li>
 * <li>{@code correlationMaskCount} &ndash; zero or a number of correlation masks.</li>
 * <li>{@code pCorrelationMasks} &ndash; an array of view masks indicating sets of views that <b>may</b> be more efficient to render concurrently.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct VkRenderPassMultiviewCreateInfoKHX {
 *     VkStructureType sType;
 *     const void * pNext;
 *     uint32_t subpassCount;
 *     const uint32_t * pViewMasks;
 *     uint32_t dependencyCount;
 *     const int32_t * pViewOffsets;
 *     uint32_t correlationMaskCount;
 *     const uint32_t * pCorrelationMasks;
 * }</pre></code>
 */
public class VkRenderPassMultiviewCreateInfoKHX extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SUBPASSCOUNT,
        PVIEWMASKS,
        DEPENDENCYCOUNT,
        PVIEWOFFSETS,
        CORRELATIONMASKCOUNT,
        PCORRELATIONMASKS;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SUBPASSCOUNT = layout.offsetof(2);
        PVIEWMASKS = layout.offsetof(3);
        DEPENDENCYCOUNT = layout.offsetof(4);
        PVIEWOFFSETS = layout.offsetof(5);
        CORRELATIONMASKCOUNT = layout.offsetof(6);
        PCORRELATIONMASKS = layout.offsetof(7);
    }

    VkRenderPassMultiviewCreateInfoKHX(long address, ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VkRenderPassMultiviewCreateInfoKHX} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkRenderPassMultiviewCreateInfoKHX(ByteBuffer container) {
        this(memAddress(container), checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    @NativeType("const void *")
    public long pNext() { return npNext(address()); }
    /** Returns the value of the {@code subpassCount} field. */
    @NativeType("uint32_t")
    public int subpassCount() { return nsubpassCount(address()); }
    /** Returns a {@link IntBuffer} view of the data pointed to by the {@code pViewMasks} field. */
    @NativeType("const uint32_t *")
    public IntBuffer pViewMasks() { return npViewMasks(address()); }
    /** Returns the value of the {@code dependencyCount} field. */
    @NativeType("uint32_t")
    public int dependencyCount() { return ndependencyCount(address()); }
    /** Returns a {@link IntBuffer} view of the data pointed to by the {@code pViewOffsets} field. */
    @NativeType("const int32_t *")
    public IntBuffer pViewOffsets() { return npViewOffsets(address()); }
    /** Returns the value of the {@code correlationMaskCount} field. */
    @NativeType("uint32_t")
    public int correlationMaskCount() { return ncorrelationMaskCount(address()); }
    /** Returns a {@link IntBuffer} view of the data pointed to by the {@code pCorrelationMasks} field. */
    @NativeType("const uint32_t *")
    public IntBuffer pCorrelationMasks() { return npCorrelationMasks(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkRenderPassMultiviewCreateInfoKHX sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkRenderPassMultiviewCreateInfoKHX pNext(@NativeType("const void *") long value) { npNext(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code pViewMasks} field. */
    public VkRenderPassMultiviewCreateInfoKHX pViewMasks(@NativeType("const uint32_t *") IntBuffer value) { npViewMasks(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code pViewOffsets} field. */
    public VkRenderPassMultiviewCreateInfoKHX pViewOffsets(@NativeType("const int32_t *") IntBuffer value) { npViewOffsets(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code pCorrelationMasks} field. */
    public VkRenderPassMultiviewCreateInfoKHX pCorrelationMasks(@NativeType("const uint32_t *") IntBuffer value) { npCorrelationMasks(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkRenderPassMultiviewCreateInfoKHX set(
        int sType,
        long pNext,
        IntBuffer pViewMasks,
        IntBuffer pViewOffsets,
        IntBuffer pCorrelationMasks
    ) {
        sType(sType);
        pNext(pNext);
        pViewMasks(pViewMasks);
        pViewOffsets(pViewOffsets);
        pCorrelationMasks(pCorrelationMasks);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkRenderPassMultiviewCreateInfoKHX set(VkRenderPassMultiviewCreateInfoKHX src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VkRenderPassMultiviewCreateInfoKHX} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkRenderPassMultiviewCreateInfoKHX malloc() {
        return create(nmemAlloc(SIZEOF));
    }

    /** Returns a new {@link VkRenderPassMultiviewCreateInfoKHX} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkRenderPassMultiviewCreateInfoKHX calloc() {
        return create(nmemCalloc(1, SIZEOF));
    }

    /** Returns a new {@link VkRenderPassMultiviewCreateInfoKHX} instance allocated with {@link BufferUtils}. */
    public static VkRenderPassMultiviewCreateInfoKHX create() {
        return new VkRenderPassMultiviewCreateInfoKHX(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link VkRenderPassMultiviewCreateInfoKHX} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
    public static VkRenderPassMultiviewCreateInfoKHX create(long address) {
        return address == NULL ? null : new VkRenderPassMultiviewCreateInfoKHX(address, null);
    }

    /**
     * Returns a new {@link VkRenderPassMultiviewCreateInfoKHX.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkRenderPassMultiviewCreateInfoKHX.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer calloc(int capacity) {
        return create(nmemCalloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkRenderPassMultiviewCreateInfoKHX.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link VkRenderPassMultiviewCreateInfoKHX.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Buffer create(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VkRenderPassMultiviewCreateInfoKHX} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkRenderPassMultiviewCreateInfoKHX mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VkRenderPassMultiviewCreateInfoKHX} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkRenderPassMultiviewCreateInfoKHX callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VkRenderPassMultiviewCreateInfoKHX} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkRenderPassMultiviewCreateInfoKHX mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VkRenderPassMultiviewCreateInfoKHX} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkRenderPassMultiviewCreateInfoKHX callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkRenderPassMultiviewCreateInfoKHX.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkRenderPassMultiviewCreateInfoKHX.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkRenderPassMultiviewCreateInfoKHX.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkRenderPassMultiviewCreateInfoKHX.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkRenderPassMultiviewCreateInfoKHX.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkRenderPassMultiviewCreateInfoKHX.PNEXT); }
    /** Unsafe version of {@link #subpassCount}. */
    public static int nsubpassCount(long struct) { return memGetInt(struct + VkRenderPassMultiviewCreateInfoKHX.SUBPASSCOUNT); }
    /** Unsafe version of {@link #pViewMasks() pViewMasks}. */
    public static IntBuffer npViewMasks(long struct) { return memIntBuffer(memGetAddress(struct + VkRenderPassMultiviewCreateInfoKHX.PVIEWMASKS), nsubpassCount(struct)); }
    /** Unsafe version of {@link #dependencyCount}. */
    public static int ndependencyCount(long struct) { return memGetInt(struct + VkRenderPassMultiviewCreateInfoKHX.DEPENDENCYCOUNT); }
    /** Unsafe version of {@link #pViewOffsets() pViewOffsets}. */
    public static IntBuffer npViewOffsets(long struct) { return memIntBuffer(memGetAddress(struct + VkRenderPassMultiviewCreateInfoKHX.PVIEWOFFSETS), ndependencyCount(struct)); }
    /** Unsafe version of {@link #correlationMaskCount}. */
    public static int ncorrelationMaskCount(long struct) { return memGetInt(struct + VkRenderPassMultiviewCreateInfoKHX.CORRELATIONMASKCOUNT); }
    /** Unsafe version of {@link #pCorrelationMasks() pCorrelationMasks}. */
    public static IntBuffer npCorrelationMasks(long struct) { return memIntBuffer(memGetAddress(struct + VkRenderPassMultiviewCreateInfoKHX.PCORRELATIONMASKS), ncorrelationMaskCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkRenderPassMultiviewCreateInfoKHX.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkRenderPassMultiviewCreateInfoKHX.PNEXT, value); }
    /** Sets the specified value to the {@code subpassCount} field of the specified {@code struct}. */
    public static void nsubpassCount(long struct, int value) { memPutInt(struct + VkRenderPassMultiviewCreateInfoKHX.SUBPASSCOUNT, value); }
    /** Unsafe version of {@link #pViewMasks(IntBuffer) pViewMasks}. */
    public static void npViewMasks(long struct, IntBuffer value) { memPutAddress(struct + VkRenderPassMultiviewCreateInfoKHX.PVIEWMASKS, memAddressSafe(value)); nsubpassCount(struct, value == null ? 0 : value.remaining()); }
    /** Sets the specified value to the {@code dependencyCount} field of the specified {@code struct}. */
    public static void ndependencyCount(long struct, int value) { memPutInt(struct + VkRenderPassMultiviewCreateInfoKHX.DEPENDENCYCOUNT, value); }
    /** Unsafe version of {@link #pViewOffsets(IntBuffer) pViewOffsets}. */
    public static void npViewOffsets(long struct, IntBuffer value) { memPutAddress(struct + VkRenderPassMultiviewCreateInfoKHX.PVIEWOFFSETS, memAddressSafe(value)); ndependencyCount(struct, value == null ? 0 : value.remaining()); }
    /** Sets the specified value to the {@code correlationMaskCount} field of the specified {@code struct}. */
    public static void ncorrelationMaskCount(long struct, int value) { memPutInt(struct + VkRenderPassMultiviewCreateInfoKHX.CORRELATIONMASKCOUNT, value); }
    /** Unsafe version of {@link #pCorrelationMasks(IntBuffer) pCorrelationMasks}. */
    public static void npCorrelationMasks(long struct, IntBuffer value) { memPutAddress(struct + VkRenderPassMultiviewCreateInfoKHX.PCORRELATIONMASKS, memAddressSafe(value)); ncorrelationMaskCount(struct, value == null ? 0 : value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        if (nsubpassCount(struct) != 0) {
            check(memGetAddress(struct + VkRenderPassMultiviewCreateInfoKHX.PVIEWMASKS));
        }
        if (ndependencyCount(struct) != 0) {
            check(memGetAddress(struct + VkRenderPassMultiviewCreateInfoKHX.PVIEWOFFSETS));
        }
        if (ncorrelationMaskCount(struct) != 0) {
            check(memGetAddress(struct + VkRenderPassMultiviewCreateInfoKHX.PCORRELATIONMASKS));
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

    /** An array of {@link VkRenderPassMultiviewCreateInfoKHX} structs. */
    public static class Buffer extends StructBuffer<VkRenderPassMultiviewCreateInfoKHX, Buffer> implements NativeResource {

        /**
         * Creates a new {@link VkRenderPassMultiviewCreateInfoKHX.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkRenderPassMultiviewCreateInfoKHX#SIZEOF}, and its mark will be undefined.
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
        protected VkRenderPassMultiviewCreateInfoKHX newInstance(long address) {
            return new VkRenderPassMultiviewCreateInfoKHX(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkRenderPassMultiviewCreateInfoKHX.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("const void *")
        public long pNext() { return VkRenderPassMultiviewCreateInfoKHX.npNext(address()); }
        /** Returns the value of the {@code subpassCount} field. */
        @NativeType("uint32_t")
        public int subpassCount() { return VkRenderPassMultiviewCreateInfoKHX.nsubpassCount(address()); }
        /** Returns a {@link IntBuffer} view of the data pointed to by the {@code pViewMasks} field. */
        @NativeType("const uint32_t *")
        public IntBuffer pViewMasks() { return VkRenderPassMultiviewCreateInfoKHX.npViewMasks(address()); }
        /** Returns the value of the {@code dependencyCount} field. */
        @NativeType("uint32_t")
        public int dependencyCount() { return VkRenderPassMultiviewCreateInfoKHX.ndependencyCount(address()); }
        /** Returns a {@link IntBuffer} view of the data pointed to by the {@code pViewOffsets} field. */
        @NativeType("const int32_t *")
        public IntBuffer pViewOffsets() { return VkRenderPassMultiviewCreateInfoKHX.npViewOffsets(address()); }
        /** Returns the value of the {@code correlationMaskCount} field. */
        @NativeType("uint32_t")
        public int correlationMaskCount() { return VkRenderPassMultiviewCreateInfoKHX.ncorrelationMaskCount(address()); }
        /** Returns a {@link IntBuffer} view of the data pointed to by the {@code pCorrelationMasks} field. */
        @NativeType("const uint32_t *")
        public IntBuffer pCorrelationMasks() { return VkRenderPassMultiviewCreateInfoKHX.npCorrelationMasks(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkRenderPassMultiviewCreateInfoKHX.Buffer sType(@NativeType("VkStructureType") int value) { VkRenderPassMultiviewCreateInfoKHX.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkRenderPassMultiviewCreateInfoKHX.Buffer pNext(@NativeType("const void *") long value) { VkRenderPassMultiviewCreateInfoKHX.npNext(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code pViewMasks} field. */
        public VkRenderPassMultiviewCreateInfoKHX.Buffer pViewMasks(@NativeType("const uint32_t *") IntBuffer value) { VkRenderPassMultiviewCreateInfoKHX.npViewMasks(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code pViewOffsets} field. */
        public VkRenderPassMultiviewCreateInfoKHX.Buffer pViewOffsets(@NativeType("const int32_t *") IntBuffer value) { VkRenderPassMultiviewCreateInfoKHX.npViewOffsets(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code pCorrelationMasks} field. */
        public VkRenderPassMultiviewCreateInfoKHX.Buffer pCorrelationMasks(@NativeType("const uint32_t *") IntBuffer value) { VkRenderPassMultiviewCreateInfoKHX.npCorrelationMasks(address(), value); return this; }

    }

}