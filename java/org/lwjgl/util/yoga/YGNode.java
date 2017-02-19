/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.yoga;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>struct YGNode {
    {@link YGStyle YGStyle} style;
    {@link YGLayout YGLayout} layout;
    uint32_t lineIndex;
    YGNodeRef parent;
    YGNodeListRef children;
    {@link YGNode YGNode} * nextChild;
    {@link YGMeasureFuncI YGMeasureFunc} measure;
    {@link YGPrintFuncI YGPrintFunc} print;
    void * context;
    bool isDirty;
    bool hasNewLayout;
    {@link YGValue YGValue} * resolvedDimensions[2];
}</code></pre>
 */
public class YGNode extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		STYLE,
		LAYOUT,
		LINEINDEX,
		PARENT,
		CHILDREN,
		NEXTCHILD,
		MEASURE,
		PRINT,
		CONTEXT,
		ISDIRTY,
		HASNEWLAYOUT,
		RESOLVEDDIMENSIONS;

	static {
		Layout layout = __struct(
			__member(YGStyle.SIZEOF, YGStyle.ALIGNOF),
			__member(YGLayout.SIZEOF, YGLayout.ALIGNOF),
			__member(4),
			__member(POINTER_SIZE),
			__member(POINTER_SIZE),
			__member(POINTER_SIZE),
			__member(POINTER_SIZE),
			__member(POINTER_SIZE),
			__member(POINTER_SIZE),
			__member(1),
			__member(1),
			__array(POINTER_SIZE, 2)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		STYLE = layout.offsetof(0);
		LAYOUT = layout.offsetof(1);
		LINEINDEX = layout.offsetof(2);
		PARENT = layout.offsetof(3);
		CHILDREN = layout.offsetof(4);
		NEXTCHILD = layout.offsetof(5);
		MEASURE = layout.offsetof(6);
		PRINT = layout.offsetof(7);
		CONTEXT = layout.offsetof(8);
		ISDIRTY = layout.offsetof(9);
		HASNEWLAYOUT = layout.offsetof(10);
		RESOLVEDDIMENSIONS = layout.offsetof(11);
	}

	YGNode(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link YGNode} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public YGNode(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns a {@link YGStyle} view of the {@code style} field. */
	public YGStyle style() { return nstyle(address()); }
	/** Returns a {@link YGLayout} view of the {@code layout} field. */
	public YGLayout layout() { return nlayout(address()); }
	/** Returns the value of the {@code lineIndex} field. */
	public int lineIndex() { return nlineIndex(address()); }
	/** Returns the value of the {@code parent} field. */
	public long parent() { return nparent(address()); }
	/** Returns the value of the {@code children} field. */
	public long children() { return nchildren(address()); }
	/** Returns a {@link YGNode} view of the struct pointed to by the {@code nextChild} field. */
	public YGNode nextChild() { return nnextChild(address()); }
	/** Returns the value of the {@code measure} field. */
	public YGMeasureFunc measure() { return nmeasure(address()); }
	/** Returns the value of the {@code print} field. */
	public YGPrintFunc print() { return nprint(address()); }
	/** Returns the value of the {@code context} field. */
	public long context() { return ncontext(address()); }
	/** Returns the value of the {@code isDirty} field. */
	public boolean isDirty() { return nisDirty(address()); }
	/** Returns the value of the {@code hasNewLayout} field. */
	public boolean hasNewLayout() { return nhasNewLayout(address()); }
	/** Returns a {@link PointerBuffer} view of the {@code resolvedDimensions} field. */
	public PointerBuffer resolvedDimensions() { return nresolvedDimensions(address()); }
	/** Returns a {@link YGValue} view of the pointer at the specified index of the {@code resolvedDimensions}. */
	public YGValue resolvedDimensions(int index) { return nresolvedDimensions(address(), index); }

	// -----------------------------------

	/** Returns a new {@link YGNode} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static YGNode create(long address) {
		return address == NULL ? null : new YGNode(address, null);
	}

	/**
	 * Create a {@link YGNode.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #style}. */
	public static YGStyle nstyle(long struct) { return YGStyle.create(struct + YGNode.STYLE); }
	/** Unsafe version of {@link #layout}. */
	public static YGLayout nlayout(long struct) { return YGLayout.create(struct + YGNode.LAYOUT); }
	/** Unsafe version of {@link #lineIndex}. */
	public static int nlineIndex(long struct) { return memGetInt(struct + YGNode.LINEINDEX); }
	/** Unsafe version of {@link #parent}. */
	public static long nparent(long struct) { return memGetAddress(struct + YGNode.PARENT); }
	/** Unsafe version of {@link #children}. */
	public static long nchildren(long struct) { return memGetAddress(struct + YGNode.CHILDREN); }
	/** Unsafe version of {@link #nextChild}. */
	public static YGNode nnextChild(long struct) { return YGNode.create(memGetAddress(struct + YGNode.NEXTCHILD)); }
	/** Unsafe version of {@link #measure}. */
	public static YGMeasureFunc nmeasure(long struct) { return YGMeasureFunc.create(memGetAddress(struct + YGNode.MEASURE)); }
	/** Unsafe version of {@link #print}. */
	public static YGPrintFunc nprint(long struct) { return YGPrintFunc.create(memGetAddress(struct + YGNode.PRINT)); }
	/** Unsafe version of {@link #context}. */
	public static long ncontext(long struct) { return memGetAddress(struct + YGNode.CONTEXT); }
	/** Unsafe version of {@link #isDirty}. */
	public static boolean nisDirty(long struct) { return memGetByte(struct + YGNode.ISDIRTY) != 0; }
	/** Unsafe version of {@link #hasNewLayout}. */
	public static boolean nhasNewLayout(long struct) { return memGetByte(struct + YGNode.HASNEWLAYOUT) != 0; }
	/** Unsafe version of {@link #resolvedDimensions}. */
	public static PointerBuffer nresolvedDimensions(long struct) { return memPointerBuffer(struct + YGNode.RESOLVEDDIMENSIONS, 2); }
	/** Unsafe version of {@link #resolvedDimensions(int) resolvedDimensions}. */
	public static YGValue nresolvedDimensions(long struct, int index) {
		if ( CHECKS ) check(index, 2);
		return YGValue.create(memGetAddress(struct + YGNode.RESOLVEDDIMENSIONS + index * POINTER_SIZE));
	}

	// -----------------------------------

	/** An array of {@link YGNode} structs. */
	public static class Buffer extends StructBuffer<YGNode, Buffer> {

		/**
		 * Creates a new {@link YGNode.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link YGNode#SIZEOF}, and its mark will be undefined.
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
		protected YGNode newInstance(long address) {
			return new YGNode(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns a {@link YGStyle} view of the {@code style} field. */
		public YGStyle style() { return YGNode.nstyle(address()); }
		/** Returns a {@link YGLayout} view of the {@code layout} field. */
		public YGLayout layout() { return YGNode.nlayout(address()); }
		/** Returns the value of the {@code lineIndex} field. */
		public int lineIndex() { return YGNode.nlineIndex(address()); }
		/** Returns the value of the {@code parent} field. */
		public long parent() { return YGNode.nparent(address()); }
		/** Returns the value of the {@code children} field. */
		public long children() { return YGNode.nchildren(address()); }
		/** Returns a {@link YGNode} view of the struct pointed to by the {@code nextChild} field. */
		public YGNode nextChild() { return YGNode.nnextChild(address()); }
		/** Returns the value of the {@code measure} field. */
		public YGMeasureFunc measure() { return YGNode.nmeasure(address()); }
		/** Returns the value of the {@code print} field. */
		public YGPrintFunc print() { return YGNode.nprint(address()); }
		/** Returns the value of the {@code context} field. */
		public long context() { return YGNode.ncontext(address()); }
		/** Returns the value of the {@code isDirty} field. */
		public boolean isDirty() { return YGNode.nisDirty(address()); }
		/** Returns the value of the {@code hasNewLayout} field. */
		public boolean hasNewLayout() { return YGNode.nhasNewLayout(address()); }
		/** Returns a {@link PointerBuffer} view of the {@code resolvedDimensions} field. */
		public PointerBuffer resolvedDimensions() { return YGNode.nresolvedDimensions(address()); }
		/** Returns a {@link YGValue} view of the pointer at the specified index of the {@code resolvedDimensions}. */
		public YGValue resolvedDimensions(int index) { return YGNode.nresolvedDimensions(address(), index); }

	}

}