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

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure specifying the parameters of the newly created conversion.
 * 
 * <h5>Description</h5>
 * 
 * <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
 * 
 * <p>Setting {@code forceExplicitReconstruction} to {@link VK10#VK_TRUE TRUE} <b>may</b> have a performance penalty on implementations where explicit reconstruction is not the default mode of operation.</p>
 * </div>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code format} <b>must</b> not be {@link VK10#VK_FORMAT_UNDEFINED FORMAT_UNDEFINED}</li>
 * <li>{@code format} <b>must</b> support {@link KHRSamplerYcbcrConversion#VK_FORMAT_FEATURE_MIDPOINT_CHROMA_SAMPLES_BIT_KHR FORMAT_FEATURE_MIDPOINT_CHROMA_SAMPLES_BIT_KHR} or {@link KHRSamplerYcbcrConversion#VK_FORMAT_FEATURE_COSITED_CHROMA_SAMPLES_BIT_KHR FORMAT_FEATURE_COSITED_CHROMA_SAMPLES_BIT_KHR}</li>
 * <li>If the format does not support {@link KHRSamplerYcbcrConversion#VK_FORMAT_FEATURE_COSITED_CHROMA_SAMPLES_BIT_KHR FORMAT_FEATURE_COSITED_CHROMA_SAMPLES_BIT_KHR}, {@code xChromaOffset} and {@code yChromaOffset} <b>must</b> not be {@link KHRSamplerYcbcrConversion#VK_CHROMA_LOCATION_COSITED_EVEN_KHR CHROMA_LOCATION_COSITED_EVEN_KHR}</li>
 * <li>If the format does not support {@link KHRSamplerYcbcrConversion#VK_FORMAT_FEATURE_MIDPOINT_CHROMA_SAMPLES_BIT_KHR FORMAT_FEATURE_MIDPOINT_CHROMA_SAMPLES_BIT_KHR}, {@code xChromaOffset} and {@code yChromaOffset} <b>must</b> not be {@link KHRSamplerYcbcrConversion#VK_CHROMA_LOCATION_MIDPOINT_KHR CHROMA_LOCATION_MIDPOINT_KHR}</li>
 * <li>{@code format} <b>must</b> represent unsigned normalized values (i.e. the format must be a {@code UNORM} format)</li>
 * <li>If the format has a {@code _422} or {@code _420} suffix:
 * 
 * <ul>
 * <li>{@code components.g} <b>must</b> be {@link VK10#VK_COMPONENT_SWIZZLE_IDENTITY COMPONENT_SWIZZLE_IDENTITY}</li>
 * <li>{@code components.a} <b>must</b> be {@link VK10#VK_COMPONENT_SWIZZLE_IDENTITY COMPONENT_SWIZZLE_IDENTITY}, {@link VK10#VK_COMPONENT_SWIZZLE_ONE COMPONENT_SWIZZLE_ONE}, or {@link VK10#VK_COMPONENT_SWIZZLE_ZERO COMPONENT_SWIZZLE_ZERO}</li>
 * <li>{@code components.r} <b>must</b> be {@link VK10#VK_COMPONENT_SWIZZLE_IDENTITY COMPONENT_SWIZZLE_IDENTITY} or {@link VK10#VK_COMPONENT_SWIZZLE_B COMPONENT_SWIZZLE_B}</li>
 * <li>{@code components.b} <b>must</b> be {@link VK10#VK_COMPONENT_SWIZZLE_IDENTITY COMPONENT_SWIZZLE_IDENTITY} or {@link VK10#VK_COMPONENT_SWIZZLE_R COMPONENT_SWIZZLE_R}</li>
 * <li>If either {@code components.r} or {@code components.b} is {@link VK10#VK_COMPONENT_SWIZZLE_IDENTITY COMPONENT_SWIZZLE_IDENTITY}, both values <b>must</b> be {@link VK10#VK_COMPONENT_SWIZZLE_IDENTITY COMPONENT_SWIZZLE_IDENTITY}</li>
 * </ul>
 * </li>
 * <li>If {@code ycbcrModel} is not {@link KHRSamplerYcbcrConversion#VK_SAMPLER_YCBCR_MODEL_CONVERSION_RGB_IDENTITY_KHR SAMPLER_YCBCR_MODEL_CONVERSION_RGB_IDENTITY_KHR}, then {@code components.r}, {@code components.g}, and {@code components.b} <b>must</b> correspond to channels of the {@code format}; that is, {@code components.r}, {@code components.g}, and {@code components.b} <b>must</b> not be {@link VK10#VK_COMPONENT_SWIZZLE_ZERO COMPONENT_SWIZZLE_ZERO} or {@link VK10#VK_COMPONENT_SWIZZLE_ONE COMPONENT_SWIZZLE_ONE}, and <b>must</b> not correspond to a channel which contains zero or one as a consequence of <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#textures-conversion-to-rgba">conversion to RGBA</a></li>
 * <li>If the format does not support {@link KHRSamplerYcbcrConversion#VK_FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_FORCEABLE_BIT_KHR FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_FORCEABLE_BIT_KHR}, {@code forceExplicitReconstruction} <b>must</b> be FALSE</li>
 * <li>If the format does not support {@link KHRSamplerYcbcrConversion#VK_FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_LINEAR_FILTER_BIT_KHR FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_LINEAR_FILTER_BIT_KHR}, {@code chromaFilter} <b>must</b> be {@link VK10#VK_FILTER_NEAREST FILTER_NEAREST}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRSamplerYcbcrConversion#VK_STRUCTURE_TYPE_SAMPLER_YCBCR_CONVERSION_CREATE_INFO_KHR STRUCTURE_TYPE_SAMPLER_YCBCR_CONVERSION_CREATE_INFO_KHR}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code format} <b>must</b> be a valid {@code VkFormat} value</li>
 * <li>{@code ycbcrModel} <b>must</b> be a valid {@code VkSamplerYcbcrModelConversionKHR} value</li>
 * <li>{@code ycbcrRange} <b>must</b> be a valid {@code VkSamplerYcbcrRangeKHR} value</li>
 * <li>{@code components} <b>must</b> be a valid {@link VkComponentMapping} structure</li>
 * <li>{@code xChromaOffset} <b>must</b> be a valid {@code VkChromaLocationKHR} value</li>
 * <li>{@code yChromaOffset} <b>must</b> be a valid {@code VkChromaLocationKHR} value</li>
 * <li>{@code chromaFilter} <b>must</b> be a valid {@code VkFilter} value</li>
 * </ul>
 * 
 * <p>If {@code chromaFilter} is {@link VK10#VK_FILTER_NEAREST FILTER_NEAREST}, chroma samples are reconstructed to luma channel resolution using nearest-neighbour sampling. Otherwise, chroma samples are reconstructed using interpolation. More details can be found in <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#textures-sampler-YCbCr-conversion">the description of sampler Y'C<sub>B</sub>C<sub>R</sub> conversion</a> in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#textures">Image Operations</a> chapter.</p>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkComponentMapping}, {@link KHRSamplerYcbcrConversion#vkCreateSamplerYcbcrConversionKHR CreateSamplerYcbcrConversionKHR}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code format} &ndash; the format of the image from which color information will be retrieved.</li>
 * <li>{@code ycbcrModel} &ndash; describes the color matrix for conversion between color models.</li>
 * <li>{@code ycbcrRange} &ndash; describes whether the encoded values have headroom and foot room, or whether the encoding uses the full numerical range.</li>
 * <li>{@code components} &ndash; applies a <em>swizzle</em> based on {@code VkComponentSwizzle} enums prior to range expansion and color model conversion.</li>
 * <li>{@code xChromaOffset} &ndash; describes the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#textures-chroma-reconstruction">sample location</a> associated with downsampled chroma channels in the x dimension. {@code xChromaOffset} has no effect for formats in which chroma channels are the same resolution as the luma channel.</li>
 * <li>{@code yChromaOffset} &ndash; describes the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#textures-chroma-reconstruction">sample location</a> associated with downsampled chroma channels in the y dimension. {@code yChromaOffset} has no effect for formats in which the chroma channels are not downsampled vertically.</li>
 * <li>{@code chromaFilter} &ndash; the filter for chroma reconstruction.</li>
 * <li>{@code forceExplicitReconstruction} &ndash; <b>can</b> be used to ensure that reconstruction is done explicitly, if supported.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct VkSamplerYcbcrConversionCreateInfoKHR {
 *     VkStructureType sType;
 *     const void * pNext;
 *     VkFormat format;
 *     VkSamplerYcbcrModelConversionKHR ycbcrModel;
 *     VkSamplerYcbcrRangeKHR ycbcrRange;
 *     {@link VkComponentMapping VkComponentMapping} components;
 *     VkChromaLocationKHR xChromaOffset;
 *     VkChromaLocationKHR yChromaOffset;
 *     VkFilter chromaFilter;
 *     VkBool32 forceExplicitReconstruction;
 * }</pre></code>
 */
public class VkSamplerYcbcrConversionCreateInfoKHR extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FORMAT,
        YCBCRMODEL,
        YCBCRRANGE,
        COMPONENTS,
        XCHROMAOFFSET,
        YCHROMAOFFSET,
        CHROMAFILTER,
        FORCEEXPLICITRECONSTRUCTION;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __member(VkComponentMapping.SIZEOF, VkComponentMapping.ALIGNOF),
            __member(4),
            __member(4),
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FORMAT = layout.offsetof(2);
        YCBCRMODEL = layout.offsetof(3);
        YCBCRRANGE = layout.offsetof(4);
        COMPONENTS = layout.offsetof(5);
        XCHROMAOFFSET = layout.offsetof(6);
        YCHROMAOFFSET = layout.offsetof(7);
        CHROMAFILTER = layout.offsetof(8);
        FORCEEXPLICITRECONSTRUCTION = layout.offsetof(9);
    }

    VkSamplerYcbcrConversionCreateInfoKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VkSamplerYcbcrConversionCreateInfoKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkSamplerYcbcrConversionCreateInfoKHR(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    @NativeType("const void *")
    public long pNext() { return npNext(address()); }
    /** Returns the value of the {@code format} field. */
    @NativeType("VkFormat")
    public int format() { return nformat(address()); }
    /** Returns the value of the {@code ycbcrModel} field. */
    @NativeType("VkSamplerYcbcrModelConversionKHR")
    public int ycbcrModel() { return nycbcrModel(address()); }
    /** Returns the value of the {@code ycbcrRange} field. */
    @NativeType("VkSamplerYcbcrRangeKHR")
    public int ycbcrRange() { return nycbcrRange(address()); }
    /** Returns a {@link VkComponentMapping} view of the {@code components} field. */
    public VkComponentMapping components() { return ncomponents(address()); }
    /** Returns the value of the {@code xChromaOffset} field. */
    @NativeType("VkChromaLocationKHR")
    public int xChromaOffset() { return nxChromaOffset(address()); }
    /** Returns the value of the {@code yChromaOffset} field. */
    @NativeType("VkChromaLocationKHR")
    public int yChromaOffset() { return nyChromaOffset(address()); }
    /** Returns the value of the {@code chromaFilter} field. */
    @NativeType("VkFilter")
    public int chromaFilter() { return nchromaFilter(address()); }
    /** Returns the value of the {@code forceExplicitReconstruction} field. */
    @NativeType("VkBool32")
    public boolean forceExplicitReconstruction() { return nforceExplicitReconstruction(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkSamplerYcbcrConversionCreateInfoKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkSamplerYcbcrConversionCreateInfoKHR pNext(@NativeType("const void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code format} field. */
    public VkSamplerYcbcrConversionCreateInfoKHR format(@NativeType("VkFormat") int value) { nformat(address(), value); return this; }
    /** Sets the specified value to the {@code ycbcrModel} field. */
    public VkSamplerYcbcrConversionCreateInfoKHR ycbcrModel(@NativeType("VkSamplerYcbcrModelConversionKHR") int value) { nycbcrModel(address(), value); return this; }
    /** Sets the specified value to the {@code ycbcrRange} field. */
    public VkSamplerYcbcrConversionCreateInfoKHR ycbcrRange(@NativeType("VkSamplerYcbcrRangeKHR") int value) { nycbcrRange(address(), value); return this; }
    /** Copies the specified {@link VkComponentMapping} to the {@code components} field. */
    public VkSamplerYcbcrConversionCreateInfoKHR components(VkComponentMapping value) { ncomponents(address(), value); return this; }
    /** Sets the specified value to the {@code xChromaOffset} field. */
    public VkSamplerYcbcrConversionCreateInfoKHR xChromaOffset(@NativeType("VkChromaLocationKHR") int value) { nxChromaOffset(address(), value); return this; }
    /** Sets the specified value to the {@code yChromaOffset} field. */
    public VkSamplerYcbcrConversionCreateInfoKHR yChromaOffset(@NativeType("VkChromaLocationKHR") int value) { nyChromaOffset(address(), value); return this; }
    /** Sets the specified value to the {@code chromaFilter} field. */
    public VkSamplerYcbcrConversionCreateInfoKHR chromaFilter(@NativeType("VkFilter") int value) { nchromaFilter(address(), value); return this; }
    /** Sets the specified value to the {@code forceExplicitReconstruction} field. */
    public VkSamplerYcbcrConversionCreateInfoKHR forceExplicitReconstruction(@NativeType("VkBool32") boolean value) { nforceExplicitReconstruction(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkSamplerYcbcrConversionCreateInfoKHR set(
        int sType,
        long pNext,
        int format,
        int ycbcrModel,
        int ycbcrRange,
        VkComponentMapping components,
        int xChromaOffset,
        int yChromaOffset,
        int chromaFilter,
        boolean forceExplicitReconstruction
    ) {
        sType(sType);
        pNext(pNext);
        format(format);
        ycbcrModel(ycbcrModel);
        ycbcrRange(ycbcrRange);
        components(components);
        xChromaOffset(xChromaOffset);
        yChromaOffset(yChromaOffset);
        chromaFilter(chromaFilter);
        forceExplicitReconstruction(forceExplicitReconstruction);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkSamplerYcbcrConversionCreateInfoKHR set(VkSamplerYcbcrConversionCreateInfoKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VkSamplerYcbcrConversionCreateInfoKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkSamplerYcbcrConversionCreateInfoKHR malloc() {
        return create(nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link VkSamplerYcbcrConversionCreateInfoKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkSamplerYcbcrConversionCreateInfoKHR calloc() {
        return create(nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link VkSamplerYcbcrConversionCreateInfoKHR} instance allocated with {@link BufferUtils}. */
    public static VkSamplerYcbcrConversionCreateInfoKHR create() {
        return new VkSamplerYcbcrConversionCreateInfoKHR(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link VkSamplerYcbcrConversionCreateInfoKHR} instance for the specified memory address. */
    public static VkSamplerYcbcrConversionCreateInfoKHR create(long address) {
        return new VkSamplerYcbcrConversionCreateInfoKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkSamplerYcbcrConversionCreateInfoKHR createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Returns a new {@link VkSamplerYcbcrConversionCreateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSamplerYcbcrConversionCreateInfoKHR.Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSamplerYcbcrConversionCreateInfoKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkSamplerYcbcrConversionCreateInfoKHR.Buffer calloc(int capacity) {
        return create(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSamplerYcbcrConversionCreateInfoKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkSamplerYcbcrConversionCreateInfoKHR.Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link VkSamplerYcbcrConversionCreateInfoKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkSamplerYcbcrConversionCreateInfoKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkSamplerYcbcrConversionCreateInfoKHR.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VkSamplerYcbcrConversionCreateInfoKHR} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkSamplerYcbcrConversionCreateInfoKHR mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VkSamplerYcbcrConversionCreateInfoKHR} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkSamplerYcbcrConversionCreateInfoKHR callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VkSamplerYcbcrConversionCreateInfoKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSamplerYcbcrConversionCreateInfoKHR mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VkSamplerYcbcrConversionCreateInfoKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkSamplerYcbcrConversionCreateInfoKHR callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkSamplerYcbcrConversionCreateInfoKHR.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkSamplerYcbcrConversionCreateInfoKHR.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkSamplerYcbcrConversionCreateInfoKHR.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkSamplerYcbcrConversionCreateInfoKHR.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkSamplerYcbcrConversionCreateInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSamplerYcbcrConversionCreateInfoKHR.Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkSamplerYcbcrConversionCreateInfoKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkSamplerYcbcrConversionCreateInfoKHR.Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkSamplerYcbcrConversionCreateInfoKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkSamplerYcbcrConversionCreateInfoKHR.PNEXT); }
    /** Unsafe version of {@link #format}. */
    public static int nformat(long struct) { return memGetInt(struct + VkSamplerYcbcrConversionCreateInfoKHR.FORMAT); }
    /** Unsafe version of {@link #ycbcrModel}. */
    public static int nycbcrModel(long struct) { return memGetInt(struct + VkSamplerYcbcrConversionCreateInfoKHR.YCBCRMODEL); }
    /** Unsafe version of {@link #ycbcrRange}. */
    public static int nycbcrRange(long struct) { return memGetInt(struct + VkSamplerYcbcrConversionCreateInfoKHR.YCBCRRANGE); }
    /** Unsafe version of {@link #components}. */
    public static VkComponentMapping ncomponents(long struct) { return VkComponentMapping.create(struct + VkSamplerYcbcrConversionCreateInfoKHR.COMPONENTS); }
    /** Unsafe version of {@link #xChromaOffset}. */
    public static int nxChromaOffset(long struct) { return memGetInt(struct + VkSamplerYcbcrConversionCreateInfoKHR.XCHROMAOFFSET); }
    /** Unsafe version of {@link #yChromaOffset}. */
    public static int nyChromaOffset(long struct) { return memGetInt(struct + VkSamplerYcbcrConversionCreateInfoKHR.YCHROMAOFFSET); }
    /** Unsafe version of {@link #chromaFilter}. */
    public static int nchromaFilter(long struct) { return memGetInt(struct + VkSamplerYcbcrConversionCreateInfoKHR.CHROMAFILTER); }
    /** Unsafe version of {@link #forceExplicitReconstruction}. */
    public static int nforceExplicitReconstruction(long struct) { return memGetInt(struct + VkSamplerYcbcrConversionCreateInfoKHR.FORCEEXPLICITRECONSTRUCTION); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkSamplerYcbcrConversionCreateInfoKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkSamplerYcbcrConversionCreateInfoKHR.PNEXT, value); }
    /** Unsafe version of {@link #format(int) format}. */
    public static void nformat(long struct, int value) { memPutInt(struct + VkSamplerYcbcrConversionCreateInfoKHR.FORMAT, value); }
    /** Unsafe version of {@link #ycbcrModel(int) ycbcrModel}. */
    public static void nycbcrModel(long struct, int value) { memPutInt(struct + VkSamplerYcbcrConversionCreateInfoKHR.YCBCRMODEL, value); }
    /** Unsafe version of {@link #ycbcrRange(int) ycbcrRange}. */
    public static void nycbcrRange(long struct, int value) { memPutInt(struct + VkSamplerYcbcrConversionCreateInfoKHR.YCBCRRANGE, value); }
    /** Unsafe version of {@link #components(VkComponentMapping) components}. */
    public static void ncomponents(long struct, VkComponentMapping value) { memCopy(value.address(), struct + VkSamplerYcbcrConversionCreateInfoKHR.COMPONENTS, VkComponentMapping.SIZEOF); }
    /** Unsafe version of {@link #xChromaOffset(int) xChromaOffset}. */
    public static void nxChromaOffset(long struct, int value) { memPutInt(struct + VkSamplerYcbcrConversionCreateInfoKHR.XCHROMAOFFSET, value); }
    /** Unsafe version of {@link #yChromaOffset(int) yChromaOffset}. */
    public static void nyChromaOffset(long struct, int value) { memPutInt(struct + VkSamplerYcbcrConversionCreateInfoKHR.YCHROMAOFFSET, value); }
    /** Unsafe version of {@link #chromaFilter(int) chromaFilter}. */
    public static void nchromaFilter(long struct, int value) { memPutInt(struct + VkSamplerYcbcrConversionCreateInfoKHR.CHROMAFILTER, value); }
    /** Unsafe version of {@link #forceExplicitReconstruction(boolean) forceExplicitReconstruction}. */
    public static void nforceExplicitReconstruction(long struct, int value) { memPutInt(struct + VkSamplerYcbcrConversionCreateInfoKHR.FORCEEXPLICITRECONSTRUCTION, value); }

    // -----------------------------------

    /** An array of {@link VkSamplerYcbcrConversionCreateInfoKHR} structs. */
    public static class Buffer extends StructBuffer<VkSamplerYcbcrConversionCreateInfoKHR, Buffer> implements NativeResource {

        /**
         * Creates a new {@link VkSamplerYcbcrConversionCreateInfoKHR.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkSamplerYcbcrConversionCreateInfoKHR#SIZEOF}, and its mark will be undefined.
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
        protected VkSamplerYcbcrConversionCreateInfoKHR newInstance(long address) {
            return new VkSamplerYcbcrConversionCreateInfoKHR(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkSamplerYcbcrConversionCreateInfoKHR.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("const void *")
        public long pNext() { return VkSamplerYcbcrConversionCreateInfoKHR.npNext(address()); }
        /** Returns the value of the {@code format} field. */
        @NativeType("VkFormat")
        public int format() { return VkSamplerYcbcrConversionCreateInfoKHR.nformat(address()); }
        /** Returns the value of the {@code ycbcrModel} field. */
        @NativeType("VkSamplerYcbcrModelConversionKHR")
        public int ycbcrModel() { return VkSamplerYcbcrConversionCreateInfoKHR.nycbcrModel(address()); }
        /** Returns the value of the {@code ycbcrRange} field. */
        @NativeType("VkSamplerYcbcrRangeKHR")
        public int ycbcrRange() { return VkSamplerYcbcrConversionCreateInfoKHR.nycbcrRange(address()); }
        /** Returns a {@link VkComponentMapping} view of the {@code components} field. */
        public VkComponentMapping components() { return VkSamplerYcbcrConversionCreateInfoKHR.ncomponents(address()); }
        /** Returns the value of the {@code xChromaOffset} field. */
        @NativeType("VkChromaLocationKHR")
        public int xChromaOffset() { return VkSamplerYcbcrConversionCreateInfoKHR.nxChromaOffset(address()); }
        /** Returns the value of the {@code yChromaOffset} field. */
        @NativeType("VkChromaLocationKHR")
        public int yChromaOffset() { return VkSamplerYcbcrConversionCreateInfoKHR.nyChromaOffset(address()); }
        /** Returns the value of the {@code chromaFilter} field. */
        @NativeType("VkFilter")
        public int chromaFilter() { return VkSamplerYcbcrConversionCreateInfoKHR.nchromaFilter(address()); }
        /** Returns the value of the {@code forceExplicitReconstruction} field. */
        @NativeType("VkBool32")
        public boolean forceExplicitReconstruction() { return VkSamplerYcbcrConversionCreateInfoKHR.nforceExplicitReconstruction(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkSamplerYcbcrConversionCreateInfoKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkSamplerYcbcrConversionCreateInfoKHR.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkSamplerYcbcrConversionCreateInfoKHR.Buffer pNext(@NativeType("const void *") long value) { VkSamplerYcbcrConversionCreateInfoKHR.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code format} field. */
        public VkSamplerYcbcrConversionCreateInfoKHR.Buffer format(@NativeType("VkFormat") int value) { VkSamplerYcbcrConversionCreateInfoKHR.nformat(address(), value); return this; }
        /** Sets the specified value to the {@code ycbcrModel} field. */
        public VkSamplerYcbcrConversionCreateInfoKHR.Buffer ycbcrModel(@NativeType("VkSamplerYcbcrModelConversionKHR") int value) { VkSamplerYcbcrConversionCreateInfoKHR.nycbcrModel(address(), value); return this; }
        /** Sets the specified value to the {@code ycbcrRange} field. */
        public VkSamplerYcbcrConversionCreateInfoKHR.Buffer ycbcrRange(@NativeType("VkSamplerYcbcrRangeKHR") int value) { VkSamplerYcbcrConversionCreateInfoKHR.nycbcrRange(address(), value); return this; }
        /** Copies the specified {@link VkComponentMapping} to the {@code components} field. */
        public VkSamplerYcbcrConversionCreateInfoKHR.Buffer components(VkComponentMapping value) { VkSamplerYcbcrConversionCreateInfoKHR.ncomponents(address(), value); return this; }
        /** Sets the specified value to the {@code xChromaOffset} field. */
        public VkSamplerYcbcrConversionCreateInfoKHR.Buffer xChromaOffset(@NativeType("VkChromaLocationKHR") int value) { VkSamplerYcbcrConversionCreateInfoKHR.nxChromaOffset(address(), value); return this; }
        /** Sets the specified value to the {@code yChromaOffset} field. */
        public VkSamplerYcbcrConversionCreateInfoKHR.Buffer yChromaOffset(@NativeType("VkChromaLocationKHR") int value) { VkSamplerYcbcrConversionCreateInfoKHR.nyChromaOffset(address(), value); return this; }
        /** Sets the specified value to the {@code chromaFilter} field. */
        public VkSamplerYcbcrConversionCreateInfoKHR.Buffer chromaFilter(@NativeType("VkFilter") int value) { VkSamplerYcbcrConversionCreateInfoKHR.nchromaFilter(address(), value); return this; }
        /** Sets the specified value to the {@code forceExplicitReconstruction} field. */
        public VkSamplerYcbcrConversionCreateInfoKHR.Buffer forceExplicitReconstruction(@NativeType("VkBool32") boolean value) { VkSamplerYcbcrConversionCreateInfoKHR.nforceExplicitReconstruction(address(), value ? 1 : 0); return this; }

    }

}