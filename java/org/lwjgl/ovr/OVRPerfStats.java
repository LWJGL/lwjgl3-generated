/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.ovr;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

import static org.lwjgl.ovr.OVR.ovrMaxProvidedFrameStats;

/**
 * This is a complete descriptor of the performance stats provided by the SDK.
 * 
 * <p>{@code FrameStatsCount} will have a maximum value set by {@link OVR#ovrMaxProvidedFrameStats MaxProvidedFrameStats}.</p>
 * 
 * <p>If the application calls {@link OVR#ovr_GetPerfStats GetPerfStats} at the native refresh rate of the HMD then {@code FrameStatsCount} will be 1. If the app's workload happens to
 * force {@link OVR#ovr_GetPerfStats GetPerfStats} to be called at a lower rate, then {@code FrameStatsCount} will be 2 or more.</p>
 * 
 * <p>If the app does not want to miss any performance data for any frame, it needs to ensure that it is calling {@link OVR#ovr_SubmitFrame SubmitFrame} and {@link OVR#ovr_GetPerfStats GetPerfStats} at a rate
 * that is at least: {@code HMD_refresh_rate / ovrMaxProvidedFrameStats}. On the Oculus Rift CV1 HMD, this will be equal to 18 times per second.</p>
 * 
 * <p>If the app calls {@link OVR#ovr_SubmitFrame SubmitFrame} at a rate less than 18 fps, then when calling {@link OVR#ovr_GetPerfStats GetPerfStats}, expect {@code AnyFrameStatsDropped} to become {@link OVR#ovrTrue True} while
 * {@code FrameStatsCount} is equal to {@link OVR#ovrMaxProvidedFrameStats MaxProvidedFrameStats}.</p>
 * 
 * <p>The performance entries will be ordered in reverse chronological order such that the first entry will be the most recent one.</p>
 * 
 * <p>{@code AdaptiveGpuPerformanceScale} is an edge-filtered value that a caller can use to adjust the graphics quality of the application to keep the GPU
 * utilization in check. The value is calculated as: {@code (desired_GPU_utilization / current_GPU_utilization)}</p>
 * 
 * <p>As such, when this value is 1.0, the GPU is doing the right amount of work for the app. Lower values mean the app needs to pull back on the GPU
 * utilization. If the app is going to directly drive render-target resolution using this value, then be sure to take the square-root of the value before
 * scaling the resolution with it. Changing render target resolutions however is one of the many things an app can do increase or decrease the amount of GPU
 * utilization. Since {@code AdaptiveGpuPerformanceScale} is edge-filtered and does not change rapidly (i.e. reports non-1.0 values once every couple of
 * seconds) the app can make the necessary adjustments and then keep watching the value to see if it has been satisfied.</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code FrameStats} &ndash; an array of performance stats</li>
 * <li>{@code FrameStatsCount} &ndash; the number of performance stats available in {@code FrameStats}</li>
 * <li>{@code AnyFrameStatsDropped} &ndash; if performance stats have been dropped</li>
 * <li>{@code AdaptiveGpuPerformanceScale} &ndash; the GPU performance scale</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct ovrPerfStats {
    {@link OVRPerfStatsPerCompositorFrame ovrPerfStatsPerCompositorFrame} FrameStats[ovrMaxProvidedFrameStats];
    int FrameStatsCount;
    ovrBool AnyFrameStatsDropped;
    float AdaptiveGpuPerformanceScale;
}</code></pre>
 */
public class OVRPerfStats extends Struct implements NativeResource {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		FRAMESTATS,
		FRAMESTATSCOUNT,
		ANYFRAMESTATSDROPPED,
		ADAPTIVEGPUPERFORMANCESCALE;

	static {
		Layout layout = __struct(
			__array(OVRPerfStatsPerCompositorFrame.SIZEOF, OVRPerfStatsPerCompositorFrame.ALIGNOF, ovrMaxProvidedFrameStats),
			__member(4),
			__member(1),
			__member(4)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		FRAMESTATS = layout.offsetof(0);
		FRAMESTATSCOUNT = layout.offsetof(1);
		ANYFRAMESTATSDROPPED = layout.offsetof(2);
		ADAPTIVEGPUPERFORMANCESCALE = layout.offsetof(3);
	}

	OVRPerfStats(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link OVRPerfStats} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public OVRPerfStats(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns a {@link OVRPerfStatsPerCompositorFrame}.Buffer view of the {@code FrameStats} field. */
	public OVRPerfStatsPerCompositorFrame.Buffer FrameStats() { return nFrameStats(address()); }
	/** Returns a {@link OVRPerfStatsPerCompositorFrame} view of the struct at the specified index of the {@code FrameStats} field. */
	public OVRPerfStatsPerCompositorFrame FrameStats(int index) { return nFrameStats(address(), index); }
	/** Returns the value of the {@code FrameStatsCount} field. */
	public int FrameStatsCount() { return nFrameStatsCount(address()); }
	/** Returns the value of the {@code AnyFrameStatsDropped} field. */
	public boolean AnyFrameStatsDropped() { return nAnyFrameStatsDropped(address()); }
	/** Returns the value of the {@code AdaptiveGpuPerformanceScale} field. */
	public float AdaptiveGpuPerformanceScale() { return nAdaptiveGpuPerformanceScale(address()); }

	// -----------------------------------

	/** Returns a new {@link OVRPerfStats} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static OVRPerfStats malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link OVRPerfStats} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static OVRPerfStats calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link OVRPerfStats} instance allocated with {@link BufferUtils}. */
	public static OVRPerfStats create() {
		return new OVRPerfStats(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link OVRPerfStats} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static OVRPerfStats create(long address) {
		return address == NULL ? null : new OVRPerfStats(address, null);
	}

	/**
	 * Returns a new {@link OVRPerfStats.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link OVRPerfStats.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link OVRPerfStats.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link OVRPerfStats.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link OVRPerfStats} instance allocated on the thread-local {@link MemoryStack}. */
	public static OVRPerfStats mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link OVRPerfStats} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static OVRPerfStats callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link OVRPerfStats} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static OVRPerfStats mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link OVRPerfStats} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static OVRPerfStats callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link OVRPerfStats.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link OVRPerfStats.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link OVRPerfStats.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link OVRPerfStats.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #FrameStats}. */
	public static OVRPerfStatsPerCompositorFrame.Buffer nFrameStats(long struct) {
		return OVRPerfStatsPerCompositorFrame.create(struct + OVRPerfStats.FRAMESTATS, nFrameStatsCount(struct));
	}
	/** Unsafe version of {@link #FrameStats(int) FrameStats}. */
	public static OVRPerfStatsPerCompositorFrame nFrameStats(long struct, int index) {
		return OVRPerfStatsPerCompositorFrame.create(struct + OVRPerfStats.FRAMESTATS + index * OVRPerfStatsPerCompositorFrame.SIZEOF);
	}
	/** Unsafe version of {@link #FrameStatsCount}. */
	public static int nFrameStatsCount(long struct) { return memGetInt(struct + OVRPerfStats.FRAMESTATSCOUNT); }
	/** Unsafe version of {@link #AnyFrameStatsDropped}. */
	public static boolean nAnyFrameStatsDropped(long struct) { return memGetByte(struct + OVRPerfStats.ANYFRAMESTATSDROPPED) != 0; }
	/** Unsafe version of {@link #AdaptiveGpuPerformanceScale}. */
	public static float nAdaptiveGpuPerformanceScale(long struct) { return memGetFloat(struct + OVRPerfStats.ADAPTIVEGPUPERFORMANCESCALE); }

	// -----------------------------------

	/** An array of {@link OVRPerfStats} structs. */
	public static class Buffer extends StructBuffer<OVRPerfStats, Buffer> implements NativeResource {

		/**
		 * Creates a new {@link OVRPerfStats.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link OVRPerfStats#SIZEOF}, and its mark will be undefined.
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
		protected OVRPerfStats newInstance(long address) {
			return new OVRPerfStats(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns a {@link OVRPerfStatsPerCompositorFrame}.Buffer view of the {@code FrameStats} field. */
		public OVRPerfStatsPerCompositorFrame.Buffer FrameStats() { return OVRPerfStats.nFrameStats(address()); }
		/** Returns a {@link OVRPerfStatsPerCompositorFrame} view of the struct at the specified index of the {@code FrameStats} field. */
		public OVRPerfStatsPerCompositorFrame FrameStats(int index) { return OVRPerfStats.nFrameStats(address(), index); }
		/** Returns the value of the {@code FrameStatsCount} field. */
		public int FrameStatsCount() { return OVRPerfStats.nFrameStatsCount(address()); }
		/** Returns the value of the {@code AnyFrameStatsDropped} field. */
		public boolean AnyFrameStatsDropped() { return OVRPerfStats.nAnyFrameStatsDropped(address()); }
		/** Returns the value of the {@code AdaptiveGpuPerformanceScale} field. */
		public float AdaptiveGpuPerformanceScale() { return OVRPerfStats.nAdaptiveGpuPerformanceScale(address()); }

	}

}