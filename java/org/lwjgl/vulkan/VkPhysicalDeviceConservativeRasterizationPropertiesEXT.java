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
 * Structure describing conservative raster properties that can be supported by an implementation.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTConservativeRasterization#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CONSERVATIVE_RASTERIZATION_PROPERTIES_EXT STRUCTURE_TYPE_PHYSICAL_DEVICE_CONSERVATIVE_RASTERIZATION_PROPERTIES_EXT}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * </ul>
 * 
 * <p>If the {@link VkPhysicalDeviceConservativeRasterizationPropertiesEXT} structure is included in the {@code pNext} chain of {@link VkPhysicalDeviceProperties2KHR}, it is filled with the implementation-dependent limits and properties.</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code primitiveOverestimationSize} &ndash; the size in pixels the generating primitive is increased at each of its edges during conservative rasterization overestimation mode. Even with a size of 0.0, conservative rasterization overestimation rules still apply and if any part of the pixel rectangle is covered by the generating primitive, fragments are generated for the entire pixel. However implementations <b>may</b> make the pixel coverage area even more conservative by increasing the size of the generating primitive.</li>
 * <li>{@code maxExtraPrimitiveOverestimationSize} &ndash; the maximum size in pixels of extra overestimation the implementation supports in the pipeline state. A value of 0.0 means the implementation does not support any additional overestimation of the generating primitive during conservative rasterization. A value above 0.0 allows the application to further increase the size of the generating primitive during conservative rasterization overestimation.</li>
 * <li>{@code extraPrimitiveOverestimationSizeGranularity} &ndash; the granularity of extra overestimation that can be specified in the pipeline state between 0.0 and {@code maxExtraPrimitiveOverestimationSize} inclusive. A value of 0.0 means the implementation can use the smallest representable non-zero value in the screen space pixel fixed-point grid.</li>
 * <li>{@code primitiveUnderestimation} &ndash; true if the implementation supports the {@link EXTConservativeRasterization#VK_CONSERVATIVE_RASTERIZATION_MODE_UNDERESTIMATE_EXT CONSERVATIVE_RASTERIZATION_MODE_UNDERESTIMATE_EXT} conservative rasterization mode in addition to {@link EXTConservativeRasterization#VK_CONSERVATIVE_RASTERIZATION_MODE_OVERESTIMATE_EXT CONSERVATIVE_RASTERIZATION_MODE_OVERESTIMATE_EXT}. Otherwise the implementation only supports {@link EXTConservativeRasterization#VK_CONSERVATIVE_RASTERIZATION_MODE_OVERESTIMATE_EXT CONSERVATIVE_RASTERIZATION_MODE_OVERESTIMATE_EXT}.</li>
 * <li>{@code conservativePointAndLineRasterization} &ndash; true if the implementation supports conservative rasterization of point and line primitives as well as triangle primitives. Otherwise the implementation only supports triangle primitives.</li>
 * <li>{@code degenerateTrianglesRasterized} &ndash; false if the implementation culls primitives generated from triangles that become zero area after they are quantized to the fixed-point rasterization pixel grid. {@code degenerateTrianglesRasterized} is true if these primitives are not culled and the provoking vertex attributes and depth value are used for the fragments. The primitive area calculation is done on the primitive generated from the clipped triangle if applicable. Zero area primitives are backfacing and the application <b>can</b> enable backface culling if desired.</li>
 * <li>{@code degenerateLinesRasterized} &ndash; false if the implementation culls lines that become zero length after they are quantized to the fixed-point rasterization pixel grid. {@code degenerateLinesRasterized} is true if zero length lines are not culled and the provoking vertex attributes and depth value are used for the fragments.</li>
 * <li>{@code fullyCoveredFragmentShaderInputVariable} &ndash; true if the implementation supports the SPIR-V builtin fragment shader input variable FullyCoveredEXT which indicates that conservative rasterization is enabled and the fragment pixel square is fully covered by the generating primitive.</li>
 * <li>{@code conservativeRasterizationPostDepthCoverage} &ndash; true if the implementation supports conservative rasterization with the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#shaders-fragment-earlytest-postdepthcoverage">{@code PostDepthCoverage}</a> execution mode enabled. When supported the {@code SampleMask} built-in input variable will reflect the coverage after the early per-fragment depth and stencil tests are applied even when conservative rasterization is enabled. Otherwise <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#shaders-fragment-earlytest-postdepthcoverage">{@code PostDepthCoverage}</a> execution mode <b>must</b> not be used when conservative rasterization is enabled.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct VkPhysicalDeviceConservativeRasterizationPropertiesEXT {
 *     VkStructureType sType;
 *     void * pNext;
 *     float primitiveOverestimationSize;
 *     float maxExtraPrimitiveOverestimationSize;
 *     float extraPrimitiveOverestimationSizeGranularity;
 *     VkBool32 primitiveUnderestimation;
 *     VkBool32 conservativePointAndLineRasterization;
 *     VkBool32 degenerateTrianglesRasterized;
 *     VkBool32 degenerateLinesRasterized;
 *     VkBool32 fullyCoveredFragmentShaderInputVariable;
 *     VkBool32 conservativeRasterizationPostDepthCoverage;
 * }</pre></code>
 */
public class VkPhysicalDeviceConservativeRasterizationPropertiesEXT extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        PRIMITIVEOVERESTIMATIONSIZE,
        MAXEXTRAPRIMITIVEOVERESTIMATIONSIZE,
        EXTRAPRIMITIVEOVERESTIMATIONSIZEGRANULARITY,
        PRIMITIVEUNDERESTIMATION,
        CONSERVATIVEPOINTANDLINERASTERIZATION,
        DEGENERATETRIANGLESRASTERIZED,
        DEGENERATELINESRASTERIZED,
        FULLYCOVEREDFRAGMENTSHADERINPUTVARIABLE,
        CONSERVATIVERASTERIZATIONPOSTDEPTHCOVERAGE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
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

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        PRIMITIVEOVERESTIMATIONSIZE = layout.offsetof(2);
        MAXEXTRAPRIMITIVEOVERESTIMATIONSIZE = layout.offsetof(3);
        EXTRAPRIMITIVEOVERESTIMATIONSIZEGRANULARITY = layout.offsetof(4);
        PRIMITIVEUNDERESTIMATION = layout.offsetof(5);
        CONSERVATIVEPOINTANDLINERASTERIZATION = layout.offsetof(6);
        DEGENERATETRIANGLESRASTERIZED = layout.offsetof(7);
        DEGENERATELINESRASTERIZED = layout.offsetof(8);
        FULLYCOVEREDFRAGMENTSHADERINPUTVARIABLE = layout.offsetof(9);
        CONSERVATIVERASTERIZATIONPOSTDEPTHCOVERAGE = layout.offsetof(10);
    }

    VkPhysicalDeviceConservativeRasterizationPropertiesEXT(long address, ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VkPhysicalDeviceConservativeRasterizationPropertiesEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceConservativeRasterizationPropertiesEXT(ByteBuffer container) {
        this(memAddress(container), checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** Returns the value of the {@code primitiveOverestimationSize} field. */
    public float primitiveOverestimationSize() { return nprimitiveOverestimationSize(address()); }
    /** Returns the value of the {@code maxExtraPrimitiveOverestimationSize} field. */
    public float maxExtraPrimitiveOverestimationSize() { return nmaxExtraPrimitiveOverestimationSize(address()); }
    /** Returns the value of the {@code extraPrimitiveOverestimationSizeGranularity} field. */
    public float extraPrimitiveOverestimationSizeGranularity() { return nextraPrimitiveOverestimationSizeGranularity(address()); }
    /** Returns the value of the {@code primitiveUnderestimation} field. */
    @NativeType("VkBool32")
    public boolean primitiveUnderestimation() { return nprimitiveUnderestimation(address()) != 0; }
    /** Returns the value of the {@code conservativePointAndLineRasterization} field. */
    @NativeType("VkBool32")
    public boolean conservativePointAndLineRasterization() { return nconservativePointAndLineRasterization(address()) != 0; }
    /** Returns the value of the {@code degenerateTrianglesRasterized} field. */
    @NativeType("VkBool32")
    public boolean degenerateTrianglesRasterized() { return ndegenerateTrianglesRasterized(address()) != 0; }
    /** Returns the value of the {@code degenerateLinesRasterized} field. */
    @NativeType("VkBool32")
    public boolean degenerateLinesRasterized() { return ndegenerateLinesRasterized(address()) != 0; }
    /** Returns the value of the {@code fullyCoveredFragmentShaderInputVariable} field. */
    @NativeType("VkBool32")
    public boolean fullyCoveredFragmentShaderInputVariable() { return nfullyCoveredFragmentShaderInputVariable(address()) != 0; }
    /** Returns the value of the {@code conservativeRasterizationPostDepthCoverage} field. */
    @NativeType("VkBool32")
    public boolean conservativeRasterizationPostDepthCoverage() { return nconservativeRasterizationPostDepthCoverage(address()) != 0; }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceConservativeRasterizationPropertiesEXT sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceConservativeRasterizationPropertiesEXT pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code primitiveOverestimationSize} field. */
    public VkPhysicalDeviceConservativeRasterizationPropertiesEXT primitiveOverestimationSize(float value) { nprimitiveOverestimationSize(address(), value); return this; }
    /** Sets the specified value to the {@code maxExtraPrimitiveOverestimationSize} field. */
    public VkPhysicalDeviceConservativeRasterizationPropertiesEXT maxExtraPrimitiveOverestimationSize(float value) { nmaxExtraPrimitiveOverestimationSize(address(), value); return this; }
    /** Sets the specified value to the {@code extraPrimitiveOverestimationSizeGranularity} field. */
    public VkPhysicalDeviceConservativeRasterizationPropertiesEXT extraPrimitiveOverestimationSizeGranularity(float value) { nextraPrimitiveOverestimationSizeGranularity(address(), value); return this; }
    /** Sets the specified value to the {@code primitiveUnderestimation} field. */
    public VkPhysicalDeviceConservativeRasterizationPropertiesEXT primitiveUnderestimation(@NativeType("VkBool32") boolean value) { nprimitiveUnderestimation(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code conservativePointAndLineRasterization} field. */
    public VkPhysicalDeviceConservativeRasterizationPropertiesEXT conservativePointAndLineRasterization(@NativeType("VkBool32") boolean value) { nconservativePointAndLineRasterization(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code degenerateTrianglesRasterized} field. */
    public VkPhysicalDeviceConservativeRasterizationPropertiesEXT degenerateTrianglesRasterized(@NativeType("VkBool32") boolean value) { ndegenerateTrianglesRasterized(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code degenerateLinesRasterized} field. */
    public VkPhysicalDeviceConservativeRasterizationPropertiesEXT degenerateLinesRasterized(@NativeType("VkBool32") boolean value) { ndegenerateLinesRasterized(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code fullyCoveredFragmentShaderInputVariable} field. */
    public VkPhysicalDeviceConservativeRasterizationPropertiesEXT fullyCoveredFragmentShaderInputVariable(@NativeType("VkBool32") boolean value) { nfullyCoveredFragmentShaderInputVariable(address(), value ? 1 : 0); return this; }
    /** Sets the specified value to the {@code conservativeRasterizationPostDepthCoverage} field. */
    public VkPhysicalDeviceConservativeRasterizationPropertiesEXT conservativeRasterizationPostDepthCoverage(@NativeType("VkBool32") boolean value) { nconservativeRasterizationPostDepthCoverage(address(), value ? 1 : 0); return this; }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceConservativeRasterizationPropertiesEXT set(
        int sType,
        long pNext,
        float primitiveOverestimationSize,
        float maxExtraPrimitiveOverestimationSize,
        float extraPrimitiveOverestimationSizeGranularity,
        boolean primitiveUnderestimation,
        boolean conservativePointAndLineRasterization,
        boolean degenerateTrianglesRasterized,
        boolean degenerateLinesRasterized,
        boolean fullyCoveredFragmentShaderInputVariable,
        boolean conservativeRasterizationPostDepthCoverage
    ) {
        sType(sType);
        pNext(pNext);
        primitiveOverestimationSize(primitiveOverestimationSize);
        maxExtraPrimitiveOverestimationSize(maxExtraPrimitiveOverestimationSize);
        extraPrimitiveOverestimationSizeGranularity(extraPrimitiveOverestimationSizeGranularity);
        primitiveUnderestimation(primitiveUnderestimation);
        conservativePointAndLineRasterization(conservativePointAndLineRasterization);
        degenerateTrianglesRasterized(degenerateTrianglesRasterized);
        degenerateLinesRasterized(degenerateLinesRasterized);
        fullyCoveredFragmentShaderInputVariable(fullyCoveredFragmentShaderInputVariable);
        conservativeRasterizationPostDepthCoverage(conservativeRasterizationPostDepthCoverage);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceConservativeRasterizationPropertiesEXT set(VkPhysicalDeviceConservativeRasterizationPropertiesEXT src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VkPhysicalDeviceConservativeRasterizationPropertiesEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceConservativeRasterizationPropertiesEXT malloc() {
        return create(nmemAlloc(SIZEOF));
    }

    /** Returns a new {@link VkPhysicalDeviceConservativeRasterizationPropertiesEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceConservativeRasterizationPropertiesEXT calloc() {
        return create(nmemCalloc(1, SIZEOF));
    }

    /** Returns a new {@link VkPhysicalDeviceConservativeRasterizationPropertiesEXT} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceConservativeRasterizationPropertiesEXT create() {
        return new VkPhysicalDeviceConservativeRasterizationPropertiesEXT(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link VkPhysicalDeviceConservativeRasterizationPropertiesEXT} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
    public static VkPhysicalDeviceConservativeRasterizationPropertiesEXT create(long address) {
        return address == NULL ? null : new VkPhysicalDeviceConservativeRasterizationPropertiesEXT(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceConservativeRasterizationPropertiesEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceConservativeRasterizationPropertiesEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer calloc(int capacity) {
        return create(nmemCalloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceConservativeRasterizationPropertiesEXT.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link VkPhysicalDeviceConservativeRasterizationPropertiesEXT.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Buffer create(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VkPhysicalDeviceConservativeRasterizationPropertiesEXT} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkPhysicalDeviceConservativeRasterizationPropertiesEXT mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VkPhysicalDeviceConservativeRasterizationPropertiesEXT} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkPhysicalDeviceConservativeRasterizationPropertiesEXT callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VkPhysicalDeviceConservativeRasterizationPropertiesEXT} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceConservativeRasterizationPropertiesEXT mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceConservativeRasterizationPropertiesEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceConservativeRasterizationPropertiesEXT callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkPhysicalDeviceConservativeRasterizationPropertiesEXT.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPhysicalDeviceConservativeRasterizationPropertiesEXT.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkPhysicalDeviceConservativeRasterizationPropertiesEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceConservativeRasterizationPropertiesEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceConservativeRasterizationPropertiesEXT.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceConservativeRasterizationPropertiesEXT.PNEXT); }
    /** Unsafe version of {@link #primitiveOverestimationSize}. */
    public static float nprimitiveOverestimationSize(long struct) { return memGetFloat(struct + VkPhysicalDeviceConservativeRasterizationPropertiesEXT.PRIMITIVEOVERESTIMATIONSIZE); }
    /** Unsafe version of {@link #maxExtraPrimitiveOverestimationSize}. */
    public static float nmaxExtraPrimitiveOverestimationSize(long struct) { return memGetFloat(struct + VkPhysicalDeviceConservativeRasterizationPropertiesEXT.MAXEXTRAPRIMITIVEOVERESTIMATIONSIZE); }
    /** Unsafe version of {@link #extraPrimitiveOverestimationSizeGranularity}. */
    public static float nextraPrimitiveOverestimationSizeGranularity(long struct) { return memGetFloat(struct + VkPhysicalDeviceConservativeRasterizationPropertiesEXT.EXTRAPRIMITIVEOVERESTIMATIONSIZEGRANULARITY); }
    /** Unsafe version of {@link #primitiveUnderestimation}. */
    public static int nprimitiveUnderestimation(long struct) { return memGetInt(struct + VkPhysicalDeviceConservativeRasterizationPropertiesEXT.PRIMITIVEUNDERESTIMATION); }
    /** Unsafe version of {@link #conservativePointAndLineRasterization}. */
    public static int nconservativePointAndLineRasterization(long struct) { return memGetInt(struct + VkPhysicalDeviceConservativeRasterizationPropertiesEXT.CONSERVATIVEPOINTANDLINERASTERIZATION); }
    /** Unsafe version of {@link #degenerateTrianglesRasterized}. */
    public static int ndegenerateTrianglesRasterized(long struct) { return memGetInt(struct + VkPhysicalDeviceConservativeRasterizationPropertiesEXT.DEGENERATETRIANGLESRASTERIZED); }
    /** Unsafe version of {@link #degenerateLinesRasterized}. */
    public static int ndegenerateLinesRasterized(long struct) { return memGetInt(struct + VkPhysicalDeviceConservativeRasterizationPropertiesEXT.DEGENERATELINESRASTERIZED); }
    /** Unsafe version of {@link #fullyCoveredFragmentShaderInputVariable}. */
    public static int nfullyCoveredFragmentShaderInputVariable(long struct) { return memGetInt(struct + VkPhysicalDeviceConservativeRasterizationPropertiesEXT.FULLYCOVEREDFRAGMENTSHADERINPUTVARIABLE); }
    /** Unsafe version of {@link #conservativeRasterizationPostDepthCoverage}. */
    public static int nconservativeRasterizationPostDepthCoverage(long struct) { return memGetInt(struct + VkPhysicalDeviceConservativeRasterizationPropertiesEXT.CONSERVATIVERASTERIZATIONPOSTDEPTHCOVERAGE); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceConservativeRasterizationPropertiesEXT.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceConservativeRasterizationPropertiesEXT.PNEXT, value); }
    /** Unsafe version of {@link #primitiveOverestimationSize(float) primitiveOverestimationSize}. */
    public static void nprimitiveOverestimationSize(long struct, float value) { memPutFloat(struct + VkPhysicalDeviceConservativeRasterizationPropertiesEXT.PRIMITIVEOVERESTIMATIONSIZE, value); }
    /** Unsafe version of {@link #maxExtraPrimitiveOverestimationSize(float) maxExtraPrimitiveOverestimationSize}. */
    public static void nmaxExtraPrimitiveOverestimationSize(long struct, float value) { memPutFloat(struct + VkPhysicalDeviceConservativeRasterizationPropertiesEXT.MAXEXTRAPRIMITIVEOVERESTIMATIONSIZE, value); }
    /** Unsafe version of {@link #extraPrimitiveOverestimationSizeGranularity(float) extraPrimitiveOverestimationSizeGranularity}. */
    public static void nextraPrimitiveOverestimationSizeGranularity(long struct, float value) { memPutFloat(struct + VkPhysicalDeviceConservativeRasterizationPropertiesEXT.EXTRAPRIMITIVEOVERESTIMATIONSIZEGRANULARITY, value); }
    /** Unsafe version of {@link #primitiveUnderestimation(boolean) primitiveUnderestimation}. */
    public static void nprimitiveUnderestimation(long struct, int value) { memPutInt(struct + VkPhysicalDeviceConservativeRasterizationPropertiesEXT.PRIMITIVEUNDERESTIMATION, value); }
    /** Unsafe version of {@link #conservativePointAndLineRasterization(boolean) conservativePointAndLineRasterization}. */
    public static void nconservativePointAndLineRasterization(long struct, int value) { memPutInt(struct + VkPhysicalDeviceConservativeRasterizationPropertiesEXT.CONSERVATIVEPOINTANDLINERASTERIZATION, value); }
    /** Unsafe version of {@link #degenerateTrianglesRasterized(boolean) degenerateTrianglesRasterized}. */
    public static void ndegenerateTrianglesRasterized(long struct, int value) { memPutInt(struct + VkPhysicalDeviceConservativeRasterizationPropertiesEXT.DEGENERATETRIANGLESRASTERIZED, value); }
    /** Unsafe version of {@link #degenerateLinesRasterized(boolean) degenerateLinesRasterized}. */
    public static void ndegenerateLinesRasterized(long struct, int value) { memPutInt(struct + VkPhysicalDeviceConservativeRasterizationPropertiesEXT.DEGENERATELINESRASTERIZED, value); }
    /** Unsafe version of {@link #fullyCoveredFragmentShaderInputVariable(boolean) fullyCoveredFragmentShaderInputVariable}. */
    public static void nfullyCoveredFragmentShaderInputVariable(long struct, int value) { memPutInt(struct + VkPhysicalDeviceConservativeRasterizationPropertiesEXT.FULLYCOVEREDFRAGMENTSHADERINPUTVARIABLE, value); }
    /** Unsafe version of {@link #conservativeRasterizationPostDepthCoverage(boolean) conservativeRasterizationPostDepthCoverage}. */
    public static void nconservativeRasterizationPostDepthCoverage(long struct, int value) { memPutInt(struct + VkPhysicalDeviceConservativeRasterizationPropertiesEXT.CONSERVATIVERASTERIZATIONPOSTDEPTHCOVERAGE, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceConservativeRasterizationPropertiesEXT} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceConservativeRasterizationPropertiesEXT, Buffer> implements NativeResource {

        /**
         * Creates a new {@link VkPhysicalDeviceConservativeRasterizationPropertiesEXT.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceConservativeRasterizationPropertiesEXT#SIZEOF}, and its mark will be undefined.
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
        protected VkPhysicalDeviceConservativeRasterizationPropertiesEXT newInstance(long address) {
            return new VkPhysicalDeviceConservativeRasterizationPropertiesEXT(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceConservativeRasterizationPropertiesEXT.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceConservativeRasterizationPropertiesEXT.npNext(address()); }
        /** Returns the value of the {@code primitiveOverestimationSize} field. */
        public float primitiveOverestimationSize() { return VkPhysicalDeviceConservativeRasterizationPropertiesEXT.nprimitiveOverestimationSize(address()); }
        /** Returns the value of the {@code maxExtraPrimitiveOverestimationSize} field. */
        public float maxExtraPrimitiveOverestimationSize() { return VkPhysicalDeviceConservativeRasterizationPropertiesEXT.nmaxExtraPrimitiveOverestimationSize(address()); }
        /** Returns the value of the {@code extraPrimitiveOverestimationSizeGranularity} field. */
        public float extraPrimitiveOverestimationSizeGranularity() { return VkPhysicalDeviceConservativeRasterizationPropertiesEXT.nextraPrimitiveOverestimationSizeGranularity(address()); }
        /** Returns the value of the {@code primitiveUnderestimation} field. */
        @NativeType("VkBool32")
        public boolean primitiveUnderestimation() { return VkPhysicalDeviceConservativeRasterizationPropertiesEXT.nprimitiveUnderestimation(address()) != 0; }
        /** Returns the value of the {@code conservativePointAndLineRasterization} field. */
        @NativeType("VkBool32")
        public boolean conservativePointAndLineRasterization() { return VkPhysicalDeviceConservativeRasterizationPropertiesEXT.nconservativePointAndLineRasterization(address()) != 0; }
        /** Returns the value of the {@code degenerateTrianglesRasterized} field. */
        @NativeType("VkBool32")
        public boolean degenerateTrianglesRasterized() { return VkPhysicalDeviceConservativeRasterizationPropertiesEXT.ndegenerateTrianglesRasterized(address()) != 0; }
        /** Returns the value of the {@code degenerateLinesRasterized} field. */
        @NativeType("VkBool32")
        public boolean degenerateLinesRasterized() { return VkPhysicalDeviceConservativeRasterizationPropertiesEXT.ndegenerateLinesRasterized(address()) != 0; }
        /** Returns the value of the {@code fullyCoveredFragmentShaderInputVariable} field. */
        @NativeType("VkBool32")
        public boolean fullyCoveredFragmentShaderInputVariable() { return VkPhysicalDeviceConservativeRasterizationPropertiesEXT.nfullyCoveredFragmentShaderInputVariable(address()) != 0; }
        /** Returns the value of the {@code conservativeRasterizationPostDepthCoverage} field. */
        @NativeType("VkBool32")
        public boolean conservativeRasterizationPostDepthCoverage() { return VkPhysicalDeviceConservativeRasterizationPropertiesEXT.nconservativeRasterizationPostDepthCoverage(address()) != 0; }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceConservativeRasterizationPropertiesEXT.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceConservativeRasterizationPropertiesEXT.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceConservativeRasterizationPropertiesEXT.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceConservativeRasterizationPropertiesEXT.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code primitiveOverestimationSize} field. */
        public VkPhysicalDeviceConservativeRasterizationPropertiesEXT.Buffer primitiveOverestimationSize(float value) { VkPhysicalDeviceConservativeRasterizationPropertiesEXT.nprimitiveOverestimationSize(address(), value); return this; }
        /** Sets the specified value to the {@code maxExtraPrimitiveOverestimationSize} field. */
        public VkPhysicalDeviceConservativeRasterizationPropertiesEXT.Buffer maxExtraPrimitiveOverestimationSize(float value) { VkPhysicalDeviceConservativeRasterizationPropertiesEXT.nmaxExtraPrimitiveOverestimationSize(address(), value); return this; }
        /** Sets the specified value to the {@code extraPrimitiveOverestimationSizeGranularity} field. */
        public VkPhysicalDeviceConservativeRasterizationPropertiesEXT.Buffer extraPrimitiveOverestimationSizeGranularity(float value) { VkPhysicalDeviceConservativeRasterizationPropertiesEXT.nextraPrimitiveOverestimationSizeGranularity(address(), value); return this; }
        /** Sets the specified value to the {@code primitiveUnderestimation} field. */
        public VkPhysicalDeviceConservativeRasterizationPropertiesEXT.Buffer primitiveUnderestimation(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceConservativeRasterizationPropertiesEXT.nprimitiveUnderestimation(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code conservativePointAndLineRasterization} field. */
        public VkPhysicalDeviceConservativeRasterizationPropertiesEXT.Buffer conservativePointAndLineRasterization(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceConservativeRasterizationPropertiesEXT.nconservativePointAndLineRasterization(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code degenerateTrianglesRasterized} field. */
        public VkPhysicalDeviceConservativeRasterizationPropertiesEXT.Buffer degenerateTrianglesRasterized(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceConservativeRasterizationPropertiesEXT.ndegenerateTrianglesRasterized(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code degenerateLinesRasterized} field. */
        public VkPhysicalDeviceConservativeRasterizationPropertiesEXT.Buffer degenerateLinesRasterized(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceConservativeRasterizationPropertiesEXT.ndegenerateLinesRasterized(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code fullyCoveredFragmentShaderInputVariable} field. */
        public VkPhysicalDeviceConservativeRasterizationPropertiesEXT.Buffer fullyCoveredFragmentShaderInputVariable(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceConservativeRasterizationPropertiesEXT.nfullyCoveredFragmentShaderInputVariable(address(), value ? 1 : 0); return this; }
        /** Sets the specified value to the {@code conservativeRasterizationPostDepthCoverage} field. */
        public VkPhysicalDeviceConservativeRasterizationPropertiesEXT.Buffer conservativeRasterizationPostDepthCoverage(@NativeType("VkBool32") boolean value) { VkPhysicalDeviceConservativeRasterizationPropertiesEXT.nconservativeRasterizationPostDepthCoverage(address(), value ? 1 : 0); return this; }

    }

}