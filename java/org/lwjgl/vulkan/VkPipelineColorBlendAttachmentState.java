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
 * <a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/VkPipelineColorBlendAttachmentState.html">Khronos Reference Page</a><br>
 * <a href="https://www.khronos.org/registry/vulkan/specs/1.0-wsi_extensions/xhtml/vkspec.html#VkPipelineColorBlendAttachmentState">Vulkan Specification</a>
 * 
 * <p>Contains information about per-target blending state as part of graphics pipeline creation.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code srcColorBlendFactor} <b>must</b> be a valid {@code VkBlendFactor} value</li>
 * <li>{@code dstColorBlendFactor} <b>must</b> be a valid {@code VkBlendFactor} value</li>
 * <li>{@code colorBlendOp} <b>must</b> be a valid {@code VkBlendOp} value</li>
 * <li>{@code srcAlphaBlendFactor} <b>must</b> be a valid {@code VkBlendFactor} value</li>
 * <li>{@code dstAlphaBlendFactor} <b>must</b> be a valid {@code VkBlendFactor} value</li>
 * <li>{@code alphaBlendOp} <b>must</b> be a valid {@code VkBlendOp} value</li>
 * <li>{@code colorWriteMask} <b>must</b> be a valid combination of {@code VkColorComponentFlagBits} values</li>
 * <li>If the dual source blending feature is not enabled, {@code srcColorBlendFactor} <b>must not</b> be {@link VK10#VK_BLEND_FACTOR_SRC1_COLOR BLEND_FACTOR_SRC1_COLOR},
 * {@link VK10#VK_BLEND_FACTOR_ONE_MINUS_SRC1_COLOR BLEND_FACTOR_ONE_MINUS_SRC1_COLOR}, {@link VK10#VK_BLEND_FACTOR_SRC1_ALPHA BLEND_FACTOR_SRC1_ALPHA}, or {@link VK10#VK_BLEND_FACTOR_ONE_MINUS_SRC1_ALPHA BLEND_FACTOR_ONE_MINUS_SRC1_ALPHA}</li>
 * <li>If the dual source blending feature is not enabled, {@code dstColorBlendFactor} <b>must not</b> be {@link VK10#VK_BLEND_FACTOR_SRC1_COLOR BLEND_FACTOR_SRC1_COLOR},
 * {@link VK10#VK_BLEND_FACTOR_ONE_MINUS_SRC1_COLOR BLEND_FACTOR_ONE_MINUS_SRC1_COLOR}, {@link VK10#VK_BLEND_FACTOR_SRC1_ALPHA BLEND_FACTOR_SRC1_ALPHA}, or {@link VK10#VK_BLEND_FACTOR_ONE_MINUS_SRC1_ALPHA BLEND_FACTOR_ONE_MINUS_SRC1_ALPHA}</li>
 * <li>If the dual source blending feature is not enabled, {@code srcAlphaBlendFactor} <b>must not</b> be {@link VK10#VK_BLEND_FACTOR_SRC1_COLOR BLEND_FACTOR_SRC1_COLOR},
 * {@link VK10#VK_BLEND_FACTOR_ONE_MINUS_SRC1_COLOR BLEND_FACTOR_ONE_MINUS_SRC1_COLOR}, {@link VK10#VK_BLEND_FACTOR_SRC1_ALPHA BLEND_FACTOR_SRC1_ALPHA}, or {@link VK10#VK_BLEND_FACTOR_ONE_MINUS_SRC1_ALPHA BLEND_FACTOR_ONE_MINUS_SRC1_ALPHA}</li>
 * <li>If the dual source blending feature is not enabled, {@code dstAlphaBlendFactor} <b>must not</b> be {@link VK10#VK_BLEND_FACTOR_SRC1_COLOR BLEND_FACTOR_SRC1_COLOR},
 * {@link VK10#VK_BLEND_FACTOR_ONE_MINUS_SRC1_COLOR BLEND_FACTOR_ONE_MINUS_SRC1_COLOR}, {@link VK10#VK_BLEND_FACTOR_SRC1_ALPHA BLEND_FACTOR_SRC1_ALPHA}, or {@link VK10#VK_BLEND_FACTOR_ONE_MINUS_SRC1_ALPHA BLEND_FACTOR_ONE_MINUS_SRC1_ALPHA}</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code blendEnable} &ndash; controls whether blending is enabled for the corresponding color attachment</li>
 * <li>{@code srcColorBlendFactor} &ndash; selects which blend factor is used to determine the source factors S<sub>r</sub>,S<sub>g</sub>,S<sub>b</sub>. One of:<br><table><tr><td>{@link VK10#VK_BLEND_FACTOR_CONSTANT_ALPHA BLEND_FACTOR_CONSTANT_ALPHA}</td><td>{@link VK10#VK_BLEND_FACTOR_CONSTANT_COLOR BLEND_FACTOR_CONSTANT_COLOR}</td></tr><tr><td>{@link VK10#VK_BLEND_FACTOR_DST_ALPHA BLEND_FACTOR_DST_ALPHA}</td><td>{@link VK10#VK_BLEND_FACTOR_DST_COLOR BLEND_FACTOR_DST_COLOR}</td></tr><tr><td>{@link VK10#VK_BLEND_FACTOR_ONE BLEND_FACTOR_ONE}</td><td>{@link VK10#VK_BLEND_FACTOR_ONE_MINUS_CONSTANT_ALPHA BLEND_FACTOR_ONE_MINUS_CONSTANT_ALPHA}</td></tr><tr><td>{@link VK10#VK_BLEND_FACTOR_ONE_MINUS_CONSTANT_COLOR BLEND_FACTOR_ONE_MINUS_CONSTANT_COLOR}</td><td>{@link VK10#VK_BLEND_FACTOR_ONE_MINUS_DST_ALPHA BLEND_FACTOR_ONE_MINUS_DST_ALPHA}</td></tr><tr><td>{@link VK10#VK_BLEND_FACTOR_ONE_MINUS_DST_COLOR BLEND_FACTOR_ONE_MINUS_DST_COLOR}</td><td>{@link VK10#VK_BLEND_FACTOR_ONE_MINUS_SRC1_ALPHA BLEND_FACTOR_ONE_MINUS_SRC1_ALPHA}</td></tr><tr><td>{@link VK10#VK_BLEND_FACTOR_ONE_MINUS_SRC1_COLOR BLEND_FACTOR_ONE_MINUS_SRC1_COLOR}</td><td>{@link VK10#VK_BLEND_FACTOR_ONE_MINUS_SRC_ALPHA BLEND_FACTOR_ONE_MINUS_SRC_ALPHA}</td></tr><tr><td>{@link VK10#VK_BLEND_FACTOR_ONE_MINUS_SRC_COLOR BLEND_FACTOR_ONE_MINUS_SRC_COLOR}</td><td>{@link VK10#VK_BLEND_FACTOR_SRC1_ALPHA BLEND_FACTOR_SRC1_ALPHA}</td></tr><tr><td>{@link VK10#VK_BLEND_FACTOR_SRC1_COLOR BLEND_FACTOR_SRC1_COLOR}</td><td>{@link VK10#VK_BLEND_FACTOR_SRC_ALPHA BLEND_FACTOR_SRC_ALPHA}</td></tr><tr><td>{@link VK10#VK_BLEND_FACTOR_SRC_ALPHA_SATURATE BLEND_FACTOR_SRC_ALPHA_SATURATE}</td><td>{@link VK10#VK_BLEND_FACTOR_SRC_COLOR BLEND_FACTOR_SRC_COLOR}</td></tr><tr><td>{@link VK10#VK_BLEND_FACTOR_ZERO BLEND_FACTOR_ZERO}</td></tr></table></li>
 * <li>{@code dstColorBlendFactor} &ndash; selects which blend factor is used to determine the destination factors D<sub>r</sub>,D<sub>g</sub>,D<sub>b</sub></li>
 * <li>{@code colorBlendOp} &ndash; selects which blend operation is used to calculate the RGB values to write to the color attachment. One of:<br><table><tr><td>{@link VK10#VK_BLEND_OP_ADD BLEND_OP_ADD}</td><td>{@link VK10#VK_BLEND_OP_MAX BLEND_OP_MAX}</td><td>{@link VK10#VK_BLEND_OP_MIN BLEND_OP_MIN}</td><td>{@link VK10#VK_BLEND_OP_REVERSE_SUBTRACT BLEND_OP_REVERSE_SUBTRACT}</td><td>{@link VK10#VK_BLEND_OP_SUBTRACT BLEND_OP_SUBTRACT}</td></tr></table></li>
 * <li>{@code srcAlphaBlendFactor} &ndash; selects which blend factor is used to determine the source factor S<sub>a</sub></li>
 * <li>{@code dstAlphaBlendFactor} &ndash; selects which blend factor is used to determine the destination factor D<sub>a</sub></li>
 * <li>{@code alphaBlendOp} &ndash; selects which blend operation is use to calculate the alpha values to write to the color attachment</li>
 * <li>{@code colorWriteMask} &ndash; a bitmask selecting which of the R, G, B, and/or A components are enabled for writing. One or more of:<br><table><tr><td>{@link VK10#VK_COLOR_COMPONENT_A_BIT COLOR_COMPONENT_A_BIT}</td><td>{@link VK10#VK_COLOR_COMPONENT_B_BIT COLOR_COMPONENT_B_BIT}</td><td>{@link VK10#VK_COLOR_COMPONENT_G_BIT COLOR_COMPONENT_G_BIT}</td></tr><tr><td>{@link VK10#VK_COLOR_COMPONENT_R_BIT COLOR_COMPONENT_R_BIT}</td></tr></table></li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct VkPipelineColorBlendAttachmentState {
    VkBool32 blendEnable;
    VkBlendFactor srcColorBlendFactor;
    VkBlendFactor dstColorBlendFactor;
    VkBlendOp colorBlendOp;
    VkBlendFactor srcAlphaBlendFactor;
    VkBlendFactor dstAlphaBlendFactor;
    VkBlendOp alphaBlendOp;
    VkColorComponentFlags colorWriteMask;
}</code></pre>
 */
public class VkPipelineColorBlendAttachmentState extends Struct {

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
	public int blendEnable() { return nblendEnable(address()); }
	/** Returns the value of the {@code srcColorBlendFactor} field. */
	public int srcColorBlendFactor() { return nsrcColorBlendFactor(address()); }
	/** Returns the value of the {@code dstColorBlendFactor} field. */
	public int dstColorBlendFactor() { return ndstColorBlendFactor(address()); }
	/** Returns the value of the {@code colorBlendOp} field. */
	public int colorBlendOp() { return ncolorBlendOp(address()); }
	/** Returns the value of the {@code srcAlphaBlendFactor} field. */
	public int srcAlphaBlendFactor() { return nsrcAlphaBlendFactor(address()); }
	/** Returns the value of the {@code dstAlphaBlendFactor} field. */
	public int dstAlphaBlendFactor() { return ndstAlphaBlendFactor(address()); }
	/** Returns the value of the {@code alphaBlendOp} field. */
	public int alphaBlendOp() { return nalphaBlendOp(address()); }
	/** Returns the value of the {@code colorWriteMask} field. */
	public int colorWriteMask() { return ncolorWriteMask(address()); }

	/** Sets the specified value to the {@code blendEnable} field. */
	public VkPipelineColorBlendAttachmentState blendEnable(int value) { nblendEnable(address(), value); return this; }
	/** Sets the specified value to the {@code srcColorBlendFactor} field. */
	public VkPipelineColorBlendAttachmentState srcColorBlendFactor(int value) { nsrcColorBlendFactor(address(), value); return this; }
	/** Sets the specified value to the {@code dstColorBlendFactor} field. */
	public VkPipelineColorBlendAttachmentState dstColorBlendFactor(int value) { ndstColorBlendFactor(address(), value); return this; }
	/** Sets the specified value to the {@code colorBlendOp} field. */
	public VkPipelineColorBlendAttachmentState colorBlendOp(int value) { ncolorBlendOp(address(), value); return this; }
	/** Sets the specified value to the {@code srcAlphaBlendFactor} field. */
	public VkPipelineColorBlendAttachmentState srcAlphaBlendFactor(int value) { nsrcAlphaBlendFactor(address(), value); return this; }
	/** Sets the specified value to the {@code dstAlphaBlendFactor} field. */
	public VkPipelineColorBlendAttachmentState dstAlphaBlendFactor(int value) { ndstAlphaBlendFactor(address(), value); return this; }
	/** Sets the specified value to the {@code alphaBlendOp} field. */
	public VkPipelineColorBlendAttachmentState alphaBlendOp(int value) { nalphaBlendOp(address(), value); return this; }
	/** Sets the specified value to the {@code colorWriteMask} field. */
	public VkPipelineColorBlendAttachmentState colorWriteMask(int value) { ncolorWriteMask(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public VkPipelineColorBlendAttachmentState set(
		int blendEnable,
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

	/** Unsafe version of {@link #set(VkPipelineColorBlendAttachmentState) set}. */
	public VkPipelineColorBlendAttachmentState nset(long struct) {
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
	public VkPipelineColorBlendAttachmentState set(VkPipelineColorBlendAttachmentState src) {
		return nset(src.address());
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
		return create(nmemAlloc(capacity * SIZEOF), capacity);
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
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
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

	/** Unsafe version of {@link #blendEnable(int) blendEnable}. */
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
	public static final class Buffer extends StructBuffer<VkPipelineColorBlendAttachmentState, Buffer> {

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
			return new VkPipelineColorBlendAttachmentState(address, getContainer());
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code blendEnable} field. */
		public int blendEnable() { return VkPipelineColorBlendAttachmentState.nblendEnable(address()); }
		/** Returns the value of the {@code srcColorBlendFactor} field. */
		public int srcColorBlendFactor() { return VkPipelineColorBlendAttachmentState.nsrcColorBlendFactor(address()); }
		/** Returns the value of the {@code dstColorBlendFactor} field. */
		public int dstColorBlendFactor() { return VkPipelineColorBlendAttachmentState.ndstColorBlendFactor(address()); }
		/** Returns the value of the {@code colorBlendOp} field. */
		public int colorBlendOp() { return VkPipelineColorBlendAttachmentState.ncolorBlendOp(address()); }
		/** Returns the value of the {@code srcAlphaBlendFactor} field. */
		public int srcAlphaBlendFactor() { return VkPipelineColorBlendAttachmentState.nsrcAlphaBlendFactor(address()); }
		/** Returns the value of the {@code dstAlphaBlendFactor} field. */
		public int dstAlphaBlendFactor() { return VkPipelineColorBlendAttachmentState.ndstAlphaBlendFactor(address()); }
		/** Returns the value of the {@code alphaBlendOp} field. */
		public int alphaBlendOp() { return VkPipelineColorBlendAttachmentState.nalphaBlendOp(address()); }
		/** Returns the value of the {@code colorWriteMask} field. */
		public int colorWriteMask() { return VkPipelineColorBlendAttachmentState.ncolorWriteMask(address()); }

		/** Sets the specified value to the {@code blendEnable} field. */
		public VkPipelineColorBlendAttachmentState.Buffer blendEnable(int value) { VkPipelineColorBlendAttachmentState.nblendEnable(address(), value); return this; }
		/** Sets the specified value to the {@code srcColorBlendFactor} field. */
		public VkPipelineColorBlendAttachmentState.Buffer srcColorBlendFactor(int value) { VkPipelineColorBlendAttachmentState.nsrcColorBlendFactor(address(), value); return this; }
		/** Sets the specified value to the {@code dstColorBlendFactor} field. */
		public VkPipelineColorBlendAttachmentState.Buffer dstColorBlendFactor(int value) { VkPipelineColorBlendAttachmentState.ndstColorBlendFactor(address(), value); return this; }
		/** Sets the specified value to the {@code colorBlendOp} field. */
		public VkPipelineColorBlendAttachmentState.Buffer colorBlendOp(int value) { VkPipelineColorBlendAttachmentState.ncolorBlendOp(address(), value); return this; }
		/** Sets the specified value to the {@code srcAlphaBlendFactor} field. */
		public VkPipelineColorBlendAttachmentState.Buffer srcAlphaBlendFactor(int value) { VkPipelineColorBlendAttachmentState.nsrcAlphaBlendFactor(address(), value); return this; }
		/** Sets the specified value to the {@code dstAlphaBlendFactor} field. */
		public VkPipelineColorBlendAttachmentState.Buffer dstAlphaBlendFactor(int value) { VkPipelineColorBlendAttachmentState.ndstAlphaBlendFactor(address(), value); return this; }
		/** Sets the specified value to the {@code alphaBlendOp} field. */
		public VkPipelineColorBlendAttachmentState.Buffer alphaBlendOp(int value) { VkPipelineColorBlendAttachmentState.nalphaBlendOp(address(), value); return this; }
		/** Sets the specified value to the {@code colorWriteMask} field. */
		public VkPipelineColorBlendAttachmentState.Buffer colorWriteMask(int value) { VkPipelineColorBlendAttachmentState.ncolorWriteMask(address(), value); return this; }

	}

}