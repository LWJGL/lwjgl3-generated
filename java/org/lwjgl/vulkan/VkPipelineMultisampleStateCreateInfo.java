/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
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
 * <a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/VkPipelineMultisampleStateCreateInfo.html">Khronos Reference Page</a><br>
 * <a href="https://www.khronos.org/registry/vulkan/specs/1.0-wsi_extensions/xhtml/vkspec.html#VkPipelineMultisampleStateCreateInfo">Vulkan Specification</a>
 * 
 * <p>Contains information about multisampling as part of graphics pipeline creation.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK10#VK_STRUCTURE_TYPE_PIPELINE_MULTISAMPLE_STATE_CREATE_INFO STRUCTURE_TYPE_PIPELINE_MULTISAMPLE_STATE_CREATE_INFO}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code flags} <b>must</b> be 0</li>
 * <li>{@code rasterizationSamples} <b>must</b> be a valid {@code VkSampleCountFlagBits} value</li>
 * <li>If {@code pSampleMask} is not {@code NULL}, {@code pSampleMask} <b>must</b> be a pointer to an array of {@code ceil(rasterizationSamples / 32)} {@code VkSampleMask} values</li>
 * <li>If the sample rate shading feature is not enabled, {@code sampleShadingEnable} <b>must</b> be {@link VK10#VK_FALSE FALSE}</li>
 * <li>If the alpha to one feature is not enabled, {@code alphaToOneEnable} <b>must</b> be {@link VK10#VK_FALSE FALSE}</li>
 * <li>{@code minSampleShading} <b>must</b> be in the range {@code [0,1]}</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure. Must be: {@link VK10#VK_STRUCTURE_TYPE_PIPELINE_MULTISAMPLE_STATE_CREATE_INFO STRUCTURE_TYPE_PIPELINE_MULTISAMPLE_STATE_CREATE_INFO}</li>
 * <li>{@code pNext} &ndash; reserved for use by extensions</li>
 * <li>{@code flags} &ndash; reserved for future use</li>
 * <li>{@code rasterizationSamples} &ndash; a {@code VkSampleCountFlagBits} specifying the number of samples per pixel used in rasterization. One of:<br><table><tr><td>{@link VK10#VK_SAMPLE_COUNT_16_BIT SAMPLE_COUNT_16_BIT}</td><td>{@link VK10#VK_SAMPLE_COUNT_1_BIT SAMPLE_COUNT_1_BIT}</td><td>{@link VK10#VK_SAMPLE_COUNT_2_BIT SAMPLE_COUNT_2_BIT}</td><td>{@link VK10#VK_SAMPLE_COUNT_32_BIT SAMPLE_COUNT_32_BIT}</td></tr><tr><td>{@link VK10#VK_SAMPLE_COUNT_4_BIT SAMPLE_COUNT_4_BIT}</td><td>{@link VK10#VK_SAMPLE_COUNT_64_BIT SAMPLE_COUNT_64_BIT}</td><td>{@link VK10#VK_SAMPLE_COUNT_8_BIT SAMPLE_COUNT_8_BIT}</td></tr></table></li>
 * <li>{@code sampleShadingEnable} &ndash; specifies that fragment shading executes per-sample if {@link VK10#VK_TRUE TRUE}, or per-fragment if {@link VK10#VK_FALSE FALSE}</li>
 * <li>{@code minSampleShading} &ndash; the minimum fraction of sample shading</li>
 * <li>{@code pSampleMask} &ndash; a bitmask of static coverage information that is ANDed with the coverage information generated during rasterization</li>
 * <li>{@code alphaToCoverageEnable} &ndash; controls whether a temporary coverage value is generated based on the alpha component of the fragment’s first color output</li>
 * <li>{@code alphaToOneEnable} &ndash; controls whether the alpha component of the fragment’s first color output is replaced with one</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct VkPipelineMultisampleStateCreateInfo {
    VkStructureType sType;
    const void * pNext;
    VkPipelineMultisampleStateCreateFlags flags;
    VkSampleCountFlagBits rasterizationSamples;
    VkBool32 sampleShadingEnable;
    float minSampleShading;
    const VkSampleMask * pSampleMask;
    VkBool32 alphaToCoverageEnable;
    VkBool32 alphaToOneEnable;
}</code></pre>
 */
public class VkPipelineMultisampleStateCreateInfo extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		STYPE,
		PNEXT,
		FLAGS,
		RASTERIZATIONSAMPLES,
		SAMPLESHADINGENABLE,
		MINSAMPLESHADING,
		PSAMPLEMASK,
		ALPHATOCOVERAGEENABLE,
		ALPHATOONEENABLE;

	static {
		Layout layout = __struct(
			__member(4),
			__member(POINTER_SIZE),
			__member(4),
			__member(4),
			__member(4),
			__member(4),
			__member(POINTER_SIZE),
			__member(4),
			__member(4)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		STYPE = layout.offsetof(0);
		PNEXT = layout.offsetof(1);
		FLAGS = layout.offsetof(2);
		RASTERIZATIONSAMPLES = layout.offsetof(3);
		SAMPLESHADINGENABLE = layout.offsetof(4);
		MINSAMPLESHADING = layout.offsetof(5);
		PSAMPLEMASK = layout.offsetof(6);
		ALPHATOCOVERAGEENABLE = layout.offsetof(7);
		ALPHATOONEENABLE = layout.offsetof(8);
	}

	VkPipelineMultisampleStateCreateInfo(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkPipelineMultisampleStateCreateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkPipelineMultisampleStateCreateInfo(ByteBuffer container) {
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
	/** Returns the value of the {@code rasterizationSamples} field. */
	public int rasterizationSamples() { return nrasterizationSamples(address()); }
	/** Returns the value of the {@code sampleShadingEnable} field. */
	public int sampleShadingEnable() { return nsampleShadingEnable(address()); }
	/** Returns the value of the {@code minSampleShading} field. */
	public float minSampleShading() { return nminSampleShading(address()); }
	/**
	 * Returns a {@link IntBuffer} view of the data pointed to by the {@code pSampleMask} field.
	 *
	 * @param capacity the number of elements in the returned buffer
	 */
	public IntBuffer pSampleMask(int capacity) { return npSampleMask(address(), capacity); }
	/** Returns the value of the {@code alphaToCoverageEnable} field. */
	public int alphaToCoverageEnable() { return nalphaToCoverageEnable(address()); }
	/** Returns the value of the {@code alphaToOneEnable} field. */
	public int alphaToOneEnable() { return nalphaToOneEnable(address()); }

	/** Sets the specified value to the {@code sType} field. */
	public VkPipelineMultisampleStateCreateInfo sType(int value) { nsType(address(), value); return this; }
	/** Sets the specified value to the {@code pNext} field. */
	public VkPipelineMultisampleStateCreateInfo pNext(long value) { npNext(address(), value); return this; }
	/** Sets the specified value to the {@code flags} field. */
	public VkPipelineMultisampleStateCreateInfo flags(int value) { nflags(address(), value); return this; }
	/** Sets the specified value to the {@code rasterizationSamples} field. */
	public VkPipelineMultisampleStateCreateInfo rasterizationSamples(int value) { nrasterizationSamples(address(), value); return this; }
	/** Sets the specified value to the {@code sampleShadingEnable} field. */
	public VkPipelineMultisampleStateCreateInfo sampleShadingEnable(int value) { nsampleShadingEnable(address(), value); return this; }
	/** Sets the specified value to the {@code minSampleShading} field. */
	public VkPipelineMultisampleStateCreateInfo minSampleShading(float value) { nminSampleShading(address(), value); return this; }
	/** Sets the address of the specified {@link IntBuffer} to the {@code pSampleMask} field. */
	public VkPipelineMultisampleStateCreateInfo pSampleMask(IntBuffer value) { npSampleMask(address(), value); return this; }
	/** Sets the specified value to the {@code alphaToCoverageEnable} field. */
	public VkPipelineMultisampleStateCreateInfo alphaToCoverageEnable(int value) { nalphaToCoverageEnable(address(), value); return this; }
	/** Sets the specified value to the {@code alphaToOneEnable} field. */
	public VkPipelineMultisampleStateCreateInfo alphaToOneEnable(int value) { nalphaToOneEnable(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public VkPipelineMultisampleStateCreateInfo set(
		int sType,
		long pNext,
		int flags,
		int rasterizationSamples,
		int sampleShadingEnable,
		float minSampleShading,
		IntBuffer pSampleMask,
		int alphaToCoverageEnable,
		int alphaToOneEnable
	) {
		sType(sType);
		pNext(pNext);
		flags(flags);
		rasterizationSamples(rasterizationSamples);
		sampleShadingEnable(sampleShadingEnable);
		minSampleShading(minSampleShading);
		pSampleMask(pSampleMask);
		alphaToCoverageEnable(alphaToCoverageEnable);
		alphaToOneEnable(alphaToOneEnable);

		return this;
	}

	/** Unsafe version of {@link #set(VkPipelineMultisampleStateCreateInfo) set}. */
	public VkPipelineMultisampleStateCreateInfo nset(long struct) {
		memCopy(struct, address(), SIZEOF);
		return this;
	}

	/**
	 * Copies the specified struct data to this struct.
	 *
	 * @param src the source struct
	 *
	 * @return this struct
	 */
	public VkPipelineMultisampleStateCreateInfo set(VkPipelineMultisampleStateCreateInfo src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link VkPipelineMultisampleStateCreateInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static VkPipelineMultisampleStateCreateInfo malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkPipelineMultisampleStateCreateInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static VkPipelineMultisampleStateCreateInfo calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VkPipelineMultisampleStateCreateInfo} instance allocated with {@link BufferUtils}. */
	public static VkPipelineMultisampleStateCreateInfo create() {
		return new VkPipelineMultisampleStateCreateInfo(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VkPipelineMultisampleStateCreateInfo} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkPipelineMultisampleStateCreateInfo create(long address) {
		return address == NULL ? null : new VkPipelineMultisampleStateCreateInfo(address, null);
	}

	/**
	 * Returns a new {@link VkPipelineMultisampleStateCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkPipelineMultisampleStateCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkPipelineMultisampleStateCreateInfo.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VkPipelineMultisampleStateCreateInfo.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link VkPipelineMultisampleStateCreateInfo} instance allocated on the thread-local {@link MemoryStack}. */
	public static VkPipelineMultisampleStateCreateInfo mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link VkPipelineMultisampleStateCreateInfo} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static VkPipelineMultisampleStateCreateInfo callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link VkPipelineMultisampleStateCreateInfo} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkPipelineMultisampleStateCreateInfo mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link VkPipelineMultisampleStateCreateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkPipelineMultisampleStateCreateInfo callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link VkPipelineMultisampleStateCreateInfo.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkPipelineMultisampleStateCreateInfo.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkPipelineMultisampleStateCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkPipelineMultisampleStateCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #sType}. */
	public static int nsType(long struct) { return memGetInt(struct + VkPipelineMultisampleStateCreateInfo.STYPE); }
	/** Unsafe version of {@link #pNext}. */
	public static long npNext(long struct) { return memGetAddress(struct + VkPipelineMultisampleStateCreateInfo.PNEXT); }
	/** Unsafe version of {@link #flags}. */
	public static int nflags(long struct) { return memGetInt(struct + VkPipelineMultisampleStateCreateInfo.FLAGS); }
	/** Unsafe version of {@link #rasterizationSamples}. */
	public static int nrasterizationSamples(long struct) { return memGetInt(struct + VkPipelineMultisampleStateCreateInfo.RASTERIZATIONSAMPLES); }
	/** Unsafe version of {@link #sampleShadingEnable}. */
	public static int nsampleShadingEnable(long struct) { return memGetInt(struct + VkPipelineMultisampleStateCreateInfo.SAMPLESHADINGENABLE); }
	/** Unsafe version of {@link #minSampleShading}. */
	public static float nminSampleShading(long struct) { return memGetFloat(struct + VkPipelineMultisampleStateCreateInfo.MINSAMPLESHADING); }
	/** Unsafe version of {@link #pSampleMask(int) pSampleMask}. */
	public static IntBuffer npSampleMask(long struct, int capacity) { return memIntBuffer(memGetAddress(struct + VkPipelineMultisampleStateCreateInfo.PSAMPLEMASK), capacity); }
	/** Unsafe version of {@link #alphaToCoverageEnable}. */
	public static int nalphaToCoverageEnable(long struct) { return memGetInt(struct + VkPipelineMultisampleStateCreateInfo.ALPHATOCOVERAGEENABLE); }
	/** Unsafe version of {@link #alphaToOneEnable}. */
	public static int nalphaToOneEnable(long struct) { return memGetInt(struct + VkPipelineMultisampleStateCreateInfo.ALPHATOONEENABLE); }

	/** Unsafe version of {@link #sType(int) sType}. */
	public static void nsType(long struct, int value) { memPutInt(struct + VkPipelineMultisampleStateCreateInfo.STYPE, value); }
	/** Unsafe version of {@link #pNext(long) pNext}. */
	public static void npNext(long struct, long value) { memPutAddress(struct + VkPipelineMultisampleStateCreateInfo.PNEXT, value); }
	/** Unsafe version of {@link #flags(int) flags}. */
	public static void nflags(long struct, int value) { memPutInt(struct + VkPipelineMultisampleStateCreateInfo.FLAGS, value); }
	/** Unsafe version of {@link #rasterizationSamples(int) rasterizationSamples}. */
	public static void nrasterizationSamples(long struct, int value) { memPutInt(struct + VkPipelineMultisampleStateCreateInfo.RASTERIZATIONSAMPLES, value); }
	/** Unsafe version of {@link #sampleShadingEnable(int) sampleShadingEnable}. */
	public static void nsampleShadingEnable(long struct, int value) { memPutInt(struct + VkPipelineMultisampleStateCreateInfo.SAMPLESHADINGENABLE, value); }
	/** Unsafe version of {@link #minSampleShading(float) minSampleShading}. */
	public static void nminSampleShading(long struct, float value) { memPutFloat(struct + VkPipelineMultisampleStateCreateInfo.MINSAMPLESHADING, value); }
	/** Unsafe version of {@link #pSampleMask(IntBuffer) pSampleMask}. */
	public static void npSampleMask(long struct, IntBuffer value) { memPutAddress(struct + VkPipelineMultisampleStateCreateInfo.PSAMPLEMASK, memAddressSafe(value)); }
	/** Unsafe version of {@link #alphaToCoverageEnable(int) alphaToCoverageEnable}. */
	public static void nalphaToCoverageEnable(long struct, int value) { memPutInt(struct + VkPipelineMultisampleStateCreateInfo.ALPHATOCOVERAGEENABLE, value); }
	/** Unsafe version of {@link #alphaToOneEnable(int) alphaToOneEnable}. */
	public static void nalphaToOneEnable(long struct, int value) { memPutInt(struct + VkPipelineMultisampleStateCreateInfo.ALPHATOONEENABLE, value); }

	// -----------------------------------

	/** An array of {@link VkPipelineMultisampleStateCreateInfo} structs. */
	public static final class Buffer extends StructBuffer<VkPipelineMultisampleStateCreateInfo, Buffer> {

		/**
		 * Creates a new {@link VkPipelineMultisampleStateCreateInfo.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkPipelineMultisampleStateCreateInfo#SIZEOF}, and its mark will be undefined.
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
		protected VkPipelineMultisampleStateCreateInfo newInstance(long address) {
			return new VkPipelineMultisampleStateCreateInfo(address, getContainer());
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code sType} field. */
		public int sType() { return VkPipelineMultisampleStateCreateInfo.nsType(address()); }
		/** Returns the value of the {@code pNext} field. */
		public long pNext() { return VkPipelineMultisampleStateCreateInfo.npNext(address()); }
		/** Returns the value of the {@code flags} field. */
		public int flags() { return VkPipelineMultisampleStateCreateInfo.nflags(address()); }
		/** Returns the value of the {@code rasterizationSamples} field. */
		public int rasterizationSamples() { return VkPipelineMultisampleStateCreateInfo.nrasterizationSamples(address()); }
		/** Returns the value of the {@code sampleShadingEnable} field. */
		public int sampleShadingEnable() { return VkPipelineMultisampleStateCreateInfo.nsampleShadingEnable(address()); }
		/** Returns the value of the {@code minSampleShading} field. */
		public float minSampleShading() { return VkPipelineMultisampleStateCreateInfo.nminSampleShading(address()); }
		/**
		 * Returns a {@link IntBuffer} view of the data pointed to by the {@code pSampleMask} field.
		 *
		 * @param capacity the number of elements in the returned buffer
		 */
		public IntBuffer pSampleMask(int capacity) { return VkPipelineMultisampleStateCreateInfo.npSampleMask(address(), capacity); }
		/** Returns the value of the {@code alphaToCoverageEnable} field. */
		public int alphaToCoverageEnable() { return VkPipelineMultisampleStateCreateInfo.nalphaToCoverageEnable(address()); }
		/** Returns the value of the {@code alphaToOneEnable} field. */
		public int alphaToOneEnable() { return VkPipelineMultisampleStateCreateInfo.nalphaToOneEnable(address()); }

		/** Sets the specified value to the {@code sType} field. */
		public VkPipelineMultisampleStateCreateInfo.Buffer sType(int value) { VkPipelineMultisampleStateCreateInfo.nsType(address(), value); return this; }
		/** Sets the specified value to the {@code pNext} field. */
		public VkPipelineMultisampleStateCreateInfo.Buffer pNext(long value) { VkPipelineMultisampleStateCreateInfo.npNext(address(), value); return this; }
		/** Sets the specified value to the {@code flags} field. */
		public VkPipelineMultisampleStateCreateInfo.Buffer flags(int value) { VkPipelineMultisampleStateCreateInfo.nflags(address(), value); return this; }
		/** Sets the specified value to the {@code rasterizationSamples} field. */
		public VkPipelineMultisampleStateCreateInfo.Buffer rasterizationSamples(int value) { VkPipelineMultisampleStateCreateInfo.nrasterizationSamples(address(), value); return this; }
		/** Sets the specified value to the {@code sampleShadingEnable} field. */
		public VkPipelineMultisampleStateCreateInfo.Buffer sampleShadingEnable(int value) { VkPipelineMultisampleStateCreateInfo.nsampleShadingEnable(address(), value); return this; }
		/** Sets the specified value to the {@code minSampleShading} field. */
		public VkPipelineMultisampleStateCreateInfo.Buffer minSampleShading(float value) { VkPipelineMultisampleStateCreateInfo.nminSampleShading(address(), value); return this; }
		/** Sets the address of the specified {@link IntBuffer} to the {@code pSampleMask} field. */
		public VkPipelineMultisampleStateCreateInfo.Buffer pSampleMask(IntBuffer value) { VkPipelineMultisampleStateCreateInfo.npSampleMask(address(), value); return this; }
		/** Sets the specified value to the {@code alphaToCoverageEnable} field. */
		public VkPipelineMultisampleStateCreateInfo.Buffer alphaToCoverageEnable(int value) { VkPipelineMultisampleStateCreateInfo.nalphaToCoverageEnable(address(), value); return this; }
		/** Sets the specified value to the {@code alphaToOneEnable} field. */
		public VkPipelineMultisampleStateCreateInfo.Buffer alphaToOneEnable(int value) { VkPipelineMultisampleStateCreateInfo.nalphaToOneEnable(address(), value); return this; }

	}

}