/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Statistical information about a particular shader within a pipeline.
 * 
 * <h5>Description</h5>
 * 
 * <p>Some implementations may merge multiple logical shader stages together in a single shader. In such cases, {@code shaderStageMask} will contain a bitmask of all of the stages that are active within that shader. Consequently, if specifying those stages as input to {@link AMDShaderInfo#vkGetShaderInfoAMD GetShaderInfoAMD}, the same output information <b>may</b> be returned for all such shader stage queries.</p>
 * 
 * <p>The number of available VGPRs and SGPRs ({@code numAvailableVgprs} and {@code numAvailableSgprs} respectively) are the shader-addressable subset of physical registers that is given as a limit to the compiler for register assignment. These values <b>may</b> further be limited by implementations due to performance optimizations where register pressure is a bottleneck.</p>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkShaderResourceUsageAMD}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code shaderStageMask} &ndash; are the combination of logical shader stages contained within this shader.</li>
 * <li>{@code resourceUsage} &ndash; an instance of {@link VkShaderResourceUsageAMD} describing internal physical device resources used by this shader.</li>
 * <li>{@code numPhysicalVgprs} &ndash; the maximum number of vector instruction general-purpose registers (VGPRs) available to the physical device.</li>
 * <li>{@code numPhysicalSgprs} &ndash; the maximum number of scalar instruction general-purpose registers (SGPRs) available to the physical device.</li>
 * <li>{@code numAvailableVgprs} &ndash; the maximum limit of VGPRs made available to the shader compiler.</li>
 * <li>{@code numAvailableSgprs} &ndash; the maximum limit of SGPRs made available to the shader compiler.</li>
 * <li>{@code computeWorkGroupSize} &ndash; the local workgroup size of this shader in { X, Y, Z } dimensions.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct VkShaderStatisticsInfoAMD {
 *     VkShaderStageFlags shaderStageMask;
 *     {@link VkShaderResourceUsageAMD VkShaderResourceUsageAMD} resourceUsage;
 *     uint32_t numPhysicalVgprs;
 *     uint32_t numPhysicalSgprs;
 *     uint32_t numAvailableVgprs;
 *     uint32_t numAvailableSgprs;
 *     uint32_t computeWorkGroupSize[3];
 * }</pre></code>
 */
public class VkShaderStatisticsInfoAMD extends Struct {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        SHADERSTAGEMASK,
        RESOURCEUSAGE,
        NUMPHYSICALVGPRS,
        NUMPHYSICALSGPRS,
        NUMAVAILABLEVGPRS,
        NUMAVAILABLESGPRS,
        COMPUTEWORKGROUPSIZE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(VkShaderResourceUsageAMD.SIZEOF, VkShaderResourceUsageAMD.ALIGNOF),
            __member(4),
            __member(4),
            __member(4),
            __member(4),
            __array(4, 3)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        SHADERSTAGEMASK = layout.offsetof(0);
        RESOURCEUSAGE = layout.offsetof(1);
        NUMPHYSICALVGPRS = layout.offsetof(2);
        NUMPHYSICALSGPRS = layout.offsetof(3);
        NUMAVAILABLEVGPRS = layout.offsetof(4);
        NUMAVAILABLESGPRS = layout.offsetof(5);
        COMPUTEWORKGROUPSIZE = layout.offsetof(6);
    }

    VkShaderStatisticsInfoAMD(long address, ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VkShaderStatisticsInfoAMD} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkShaderStatisticsInfoAMD(ByteBuffer container) {
        this(memAddress(container), checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code shaderStageMask} field. */
    @NativeType("VkShaderStageFlags")
    public int shaderStageMask() { return nshaderStageMask(address()); }
    /** Returns a {@link VkShaderResourceUsageAMD} view of the {@code resourceUsage} field. */
    public VkShaderResourceUsageAMD resourceUsage() { return nresourceUsage(address()); }
    /** Returns the value of the {@code numPhysicalVgprs} field. */
    @NativeType("uint32_t")
    public int numPhysicalVgprs() { return nnumPhysicalVgprs(address()); }
    /** Returns the value of the {@code numPhysicalSgprs} field. */
    @NativeType("uint32_t")
    public int numPhysicalSgprs() { return nnumPhysicalSgprs(address()); }
    /** Returns the value of the {@code numAvailableVgprs} field. */
    @NativeType("uint32_t")
    public int numAvailableVgprs() { return nnumAvailableVgprs(address()); }
    /** Returns the value of the {@code numAvailableSgprs} field. */
    @NativeType("uint32_t")
    public int numAvailableSgprs() { return nnumAvailableSgprs(address()); }
    /** Returns a {@link IntBuffer} view of the {@code computeWorkGroupSize} field. */
    @NativeType("uint32_t[3]")
    public IntBuffer computeWorkGroupSize() { return ncomputeWorkGroupSize(address()); }
    /** Returns the value at the specified index of the {@code computeWorkGroupSize} field. */
    @NativeType("uint32_t")
    public int computeWorkGroupSize(int index) { return ncomputeWorkGroupSize(address(), index); }

    // -----------------------------------

    /** Returns a new {@link VkShaderStatisticsInfoAMD} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
    public static VkShaderStatisticsInfoAMD create(long address) {
        return address == NULL ? null : new VkShaderStatisticsInfoAMD(address, null);
    }

    /**
     * Create a {@link VkShaderStatisticsInfoAMD.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Buffer create(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #shaderStageMask}. */
    public static int nshaderStageMask(long struct) { return memGetInt(struct + VkShaderStatisticsInfoAMD.SHADERSTAGEMASK); }
    /** Unsafe version of {@link #resourceUsage}. */
    public static VkShaderResourceUsageAMD nresourceUsage(long struct) { return VkShaderResourceUsageAMD.create(struct + VkShaderStatisticsInfoAMD.RESOURCEUSAGE); }
    /** Unsafe version of {@link #numPhysicalVgprs}. */
    public static int nnumPhysicalVgprs(long struct) { return memGetInt(struct + VkShaderStatisticsInfoAMD.NUMPHYSICALVGPRS); }
    /** Unsafe version of {@link #numPhysicalSgprs}. */
    public static int nnumPhysicalSgprs(long struct) { return memGetInt(struct + VkShaderStatisticsInfoAMD.NUMPHYSICALSGPRS); }
    /** Unsafe version of {@link #numAvailableVgprs}. */
    public static int nnumAvailableVgprs(long struct) { return memGetInt(struct + VkShaderStatisticsInfoAMD.NUMAVAILABLEVGPRS); }
    /** Unsafe version of {@link #numAvailableSgprs}. */
    public static int nnumAvailableSgprs(long struct) { return memGetInt(struct + VkShaderStatisticsInfoAMD.NUMAVAILABLESGPRS); }
    /** Unsafe version of {@link #computeWorkGroupSize}. */
    public static IntBuffer ncomputeWorkGroupSize(long struct) { return memIntBuffer(struct + VkShaderStatisticsInfoAMD.COMPUTEWORKGROUPSIZE, 3); }
    /** Unsafe version of {@link #computeWorkGroupSize(int) computeWorkGroupSize}. */
    public static int ncomputeWorkGroupSize(long struct, int index) {
        if (CHECKS) { check(index, 3); }
        return memGetInt(struct + VkShaderStatisticsInfoAMD.COMPUTEWORKGROUPSIZE + index * 4);
    }

    // -----------------------------------

    /** An array of {@link VkShaderStatisticsInfoAMD} structs. */
    public static class Buffer extends StructBuffer<VkShaderStatisticsInfoAMD, Buffer> {

        /**
         * Creates a new {@link VkShaderStatisticsInfoAMD.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkShaderStatisticsInfoAMD#SIZEOF}, and its mark will be undefined.
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
        protected VkShaderStatisticsInfoAMD newInstance(long address) {
            return new VkShaderStatisticsInfoAMD(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code shaderStageMask} field. */
        @NativeType("VkShaderStageFlags")
        public int shaderStageMask() { return VkShaderStatisticsInfoAMD.nshaderStageMask(address()); }
        /** Returns a {@link VkShaderResourceUsageAMD} view of the {@code resourceUsage} field. */
        public VkShaderResourceUsageAMD resourceUsage() { return VkShaderStatisticsInfoAMD.nresourceUsage(address()); }
        /** Returns the value of the {@code numPhysicalVgprs} field. */
        @NativeType("uint32_t")
        public int numPhysicalVgprs() { return VkShaderStatisticsInfoAMD.nnumPhysicalVgprs(address()); }
        /** Returns the value of the {@code numPhysicalSgprs} field. */
        @NativeType("uint32_t")
        public int numPhysicalSgprs() { return VkShaderStatisticsInfoAMD.nnumPhysicalSgprs(address()); }
        /** Returns the value of the {@code numAvailableVgprs} field. */
        @NativeType("uint32_t")
        public int numAvailableVgprs() { return VkShaderStatisticsInfoAMD.nnumAvailableVgprs(address()); }
        /** Returns the value of the {@code numAvailableSgprs} field. */
        @NativeType("uint32_t")
        public int numAvailableSgprs() { return VkShaderStatisticsInfoAMD.nnumAvailableSgprs(address()); }
        /** Returns a {@link IntBuffer} view of the {@code computeWorkGroupSize} field. */
        @NativeType("uint32_t[3]")
        public IntBuffer computeWorkGroupSize() { return VkShaderStatisticsInfoAMD.ncomputeWorkGroupSize(address()); }
        /** Returns the value at the specified index of the {@code computeWorkGroupSize} field. */
        @NativeType("uint32_t")
        public int computeWorkGroupSize(int index) { return VkShaderStatisticsInfoAMD.ncomputeWorkGroupSize(address(), index); }

    }

}