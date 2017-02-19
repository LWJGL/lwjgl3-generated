/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.yoga;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Native bindings to <a href="https://facebook.github.io/yoga/">Yoga</a>.
 * 
 * <p>Yoga is an open-source, cross-platform layout library that implements Flexbox. Yoga’s focus is on creating an expressive layout library, not
 * implementing all of CSS. Therefore, there are no plans to include support for tables, floats, or similar CSS concepts. Yoga also does not support
 * styling properties that have no impact on layout, such as color or background properties.</p>
 * 
 * <h3>Yoga vs Flexbox</h3>
 * 
 * <p>Yoga aims to be compatible with Flexbox according to the w3 specification. However, Yoga was not developed to strictly adhere to the specification;
 * thus, there are aspects where Yoga differs.</p>
 * 
 * <h3>Default values</h3>
 * 
 * <p>Yoga has chosen to change the default values of some properties to better fit mobile layout use cases. The following CSS block describes the
 * differences in default values from the Flexbox w3 specification:</p>
 * 
 * <pre><code>div {
  box-sizing: border-box;
  position: relative;

  display: flex;
  flex-direction: column;
  align-items: stretch;
  flex-shrink: 0;
  align-content: flex-start;

  border-width: 0px;
  margin: 0px;
  padding: 0px;
  min-width: 0px;
}</code></pre>
 * 
 * <h3>Right-to-Left</h3>
 * 
 * <p>We believe that Right-to-Left (RTL) should be a first class citizen when it comes to layout. Therefore, Yoga implements non-standard RTL support for
 * margin, padding, border, and position properties. This enables specifying these properties as start instead of left and end instead of right.</p>
 * 
 * <h3>Yoga-specific properties</h3>
 * 
 * <p>The goal of Yoga is to be a library which makes layout easy. Of course, implementing Flexbox, a common and well-liked system, helps meet this goal.
 * However, there are areas where we think Yoga can evolve beyond Flexbox and provide developers with tools not included in the Flexbox w3 specification.
 * Currently Yoga has added one such property, AspectRatio, to solve a common problem we saw in many UIs.</p>
 */
public class Yoga {

	/**  */
	public static final float YGUndefined = Float.NaN;

	/**
	 * YGAlign
	 * 
	 * <h5>Enum values:</h5>
	 * 
	 * <ul>
	 * <li>{@link #YGAlignAuto AlignAuto}</li>
	 * <li>{@link #YGAlignFlexStart AlignFlexStart}</li>
	 * <li>{@link #YGAlignCenter AlignCenter}</li>
	 * <li>{@link #YGAlignFlexEnd AlignFlexEnd}</li>
	 * <li>{@link #YGAlignStretch AlignStretch}</li>
	 * <li>{@link #YGAlignBaseline AlignBaseline}</li>
	 * <li>{@link #YGAlignSpaceBetween AlignSpaceBetween}</li>
	 * <li>{@link #YGAlignSpaceAround AlignSpaceAround}</li>
	 * </ul>
	 */
	public static final int
		YGAlignAuto         = 0,
		YGAlignFlexStart    = 1,
		YGAlignCenter       = 2,
		YGAlignFlexEnd      = 3,
		YGAlignStretch      = 4,
		YGAlignBaseline     = 5,
		YGAlignSpaceBetween = 6,
		YGAlignSpaceAround  = 7;

	/**
	 * YGDimension
	 * 
	 * <h5>Enum values:</h5>
	 * 
	 * <ul>
	 * <li>{@link #YGDimensionWidth DimensionWidth}</li>
	 * <li>{@link #YGDimensionHeight DimensionHeight}</li>
	 * </ul>
	 */
	public static final int
		YGDimensionWidth  = 0,
		YGDimensionHeight = 1;

	/**
	 * YGDirection
	 * 
	 * <h5>Enum values:</h5>
	 * 
	 * <ul>
	 * <li>{@link #YGDirectionInherit DirectionInherit}</li>
	 * <li>{@link #YGDirectionLTR DirectionLTR}</li>
	 * <li>{@link #YGDirectionRTL DirectionRTL}</li>
	 * </ul>
	 */
	public static final int
		YGDirectionInherit = 0,
		YGDirectionLTR     = 1,
		YGDirectionRTL     = 2;

	/**
	 * YGDisplay
	 * 
	 * <h5>Enum values:</h5>
	 * 
	 * <ul>
	 * <li>{@link #YGDisplayFlex DisplayFlex}</li>
	 * <li>{@link #YGDisplayNone DisplayNone}</li>
	 * </ul>
	 */
	public static final int
		YGDisplayFlex = 0,
		YGDisplayNone = 1;

	/**
	 * YGEdge
	 * 
	 * <h5>Enum values:</h5>
	 * 
	 * <ul>
	 * <li>{@link #YGEdgeLeft EdgeLeft}</li>
	 * <li>{@link #YGEdgeTop EdgeTop}</li>
	 * <li>{@link #YGEdgeRight EdgeRight}</li>
	 * <li>{@link #YGEdgeBottom EdgeBottom}</li>
	 * <li>{@link #YGEdgeStart EdgeStart}</li>
	 * <li>{@link #YGEdgeEnd EdgeEnd}</li>
	 * <li>{@link #YGEdgeHorizontal EdgeHorizontal}</li>
	 * <li>{@link #YGEdgeVertical EdgeVertical}</li>
	 * <li>{@link #YGEdgeAll EdgeAll}</li>
	 * </ul>
	 */
	public static final int
		YGEdgeLeft       = 0,
		YGEdgeTop        = 1,
		YGEdgeRight      = 2,
		YGEdgeBottom     = 3,
		YGEdgeStart      = 4,
		YGEdgeEnd        = 5,
		YGEdgeHorizontal = 6,
		YGEdgeVertical   = 7,
		YGEdgeAll        = 8;

	/**
	 * YGExperimentalFeature
	 * 
	 * <h5>Enum values:</h5>
	 * 
	 * <ul>
	 * <li>{@link #YGExperimentalFeatureRounding ExperimentalFeatureRounding}</li>
	 * <li>{@link #YGExperimentalFeatureWebFlexBasis ExperimentalFeatureWebFlexBasis}</li>
	 * </ul>
	 */
	public static final int
		YGExperimentalFeatureRounding     = 0,
		YGExperimentalFeatureWebFlexBasis = 1;

	/**
	 * YGFlexDirection
	 * 
	 * <h5>Enum values:</h5>
	 * 
	 * <ul>
	 * <li>{@link #YGFlexDirectionColumn FlexDirectionColumn}</li>
	 * <li>{@link #YGFlexDirectionColumnReverse FlexDirectionColumnReverse}</li>
	 * <li>{@link #YGFlexDirectionRow FlexDirectionRow}</li>
	 * <li>{@link #YGFlexDirectionRowReverse FlexDirectionRowReverse}</li>
	 * </ul>
	 */
	public static final int
		YGFlexDirectionColumn        = 0,
		YGFlexDirectionColumnReverse = 1,
		YGFlexDirectionRow           = 2,
		YGFlexDirectionRowReverse    = 3;

	/**
	 * YGJustify
	 * 
	 * <h5>Enum values:</h5>
	 * 
	 * <ul>
	 * <li>{@link #YGJustifyFlexStart JustifyFlexStart}</li>
	 * <li>{@link #YGJustifyCenter JustifyCenter}</li>
	 * <li>{@link #YGJustifyFlexEnd JustifyFlexEnd}</li>
	 * <li>{@link #YGJustifySpaceBetween JustifySpaceBetween}</li>
	 * <li>{@link #YGJustifySpaceAround JustifySpaceAround}</li>
	 * </ul>
	 */
	public static final int
		YGJustifyFlexStart    = 0,
		YGJustifyCenter       = 1,
		YGJustifyFlexEnd      = 2,
		YGJustifySpaceBetween = 3,
		YGJustifySpaceAround  = 4;

	/**
	 * YGLogLevel
	 * 
	 * <h5>Enum values:</h5>
	 * 
	 * <ul>
	 * <li>{@link #YGLogLevelError LogLevelError}</li>
	 * <li>{@link #YGLogLevelWarn LogLevelWarn}</li>
	 * <li>{@link #YGLogLevelInfo LogLevelInfo}</li>
	 * <li>{@link #YGLogLevelDebug LogLevelDebug}</li>
	 * <li>{@link #YGLogLevelVerbose LogLevelVerbose}</li>
	 * </ul>
	 */
	public static final int
		YGLogLevelError   = 0,
		YGLogLevelWarn    = 1,
		YGLogLevelInfo    = 2,
		YGLogLevelDebug   = 3,
		YGLogLevelVerbose = 4;

	/**
	 * YGMeasureMode
	 * 
	 * <h5>Enum values:</h5>
	 * 
	 * <ul>
	 * <li>{@link #YGMeasureModeUndefined MeasureModeUndefined}</li>
	 * <li>{@link #YGMeasureModeExactly MeasureModeExactly}</li>
	 * <li>{@link #YGMeasureModeAtMost MeasureModeAtMost}</li>
	 * </ul>
	 */
	public static final int
		YGMeasureModeUndefined = 0,
		YGMeasureModeExactly   = 1,
		YGMeasureModeAtMost    = 2;

	/**
	 * YGOverflow
	 * 
	 * <h5>Enum values:</h5>
	 * 
	 * <ul>
	 * <li>{@link #YGOverflowVisible OverflowVisible}</li>
	 * <li>{@link #YGOverflowHidden OverflowHidden}</li>
	 * <li>{@link #YGOverflowScroll OverflowScroll}</li>
	 * </ul>
	 */
	public static final int
		YGOverflowVisible = 0,
		YGOverflowHidden  = 1,
		YGOverflowScroll  = 2;

	/**
	 * YGPositionType
	 * 
	 * <h5>Enum values:</h5>
	 * 
	 * <ul>
	 * <li>{@link #YGPositionTypeRelative PositionTypeRelative}</li>
	 * <li>{@link #YGPositionTypeAbsolute PositionTypeAbsolute}</li>
	 * </ul>
	 */
	public static final int
		YGPositionTypeRelative = 0,
		YGPositionTypeAbsolute = 1;

	/**
	 * YGPrintOptions
	 * 
	 * <h5>Enum values:</h5>
	 * 
	 * <ul>
	 * <li>{@link #YGPrintOptionsLayout PrintOptionsLayout}</li>
	 * <li>{@link #YGPrintOptionsStyle PrintOptionsStyle}</li>
	 * <li>{@link #YGPrintOptionsChildren PrintOptionsChildren}</li>
	 * </ul>
	 */
	public static final int
		YGPrintOptionsLayout   = 1,
		YGPrintOptionsStyle    = 2,
		YGPrintOptionsChildren = 4;

	/**
	 * YGUnit
	 * 
	 * <h5>Enum values:</h5>
	 * 
	 * <ul>
	 * <li>{@link #YGUnitUndefined UnitUndefined}</li>
	 * <li>{@link #YGUnitPoint UnitPoint}</li>
	 * <li>{@link #YGUnitPercent UnitPercent}</li>
	 * <li>{@link #YGUnitAuto UnitAuto}</li>
	 * </ul>
	 */
	public static final int
		YGUnitUndefined = 0,
		YGUnitPoint     = 1,
		YGUnitPercent   = 2,
		YGUnitAuto      = 3;

	/**
	 * YGWrap
	 * 
	 * <h5>Enum values:</h5>
	 * 
	 * <ul>
	 * <li>{@link #YGWrapNoWrap WrapNoWrap}</li>
	 * <li>{@link #YGWrapWrap WrapWrap}</li>
	 * <li>{@link #YGWrapReverse WrapReverse}</li>
	 * </ul>
	 */
	public static final int
		YGWrapNoWrap  = 0,
		YGWrapWrap    = 1,
		YGWrapReverse = 2;

	static { Library.loadSystem(System::load, System::loadLibrary, Yoga.class, Platform.mapLibraryNameBundled("lwjgl_yoga")); }

	protected Yoga() {
		throw new UnsupportedOperationException();
	}

	// --- [ YGNodeNew ] ---

	public static native long YGNodeNew();

	// --- [ YGNodeFree ] ---

	public static native void nYGNodeFree(long node);

	public static void YGNodeFree(long node) {
		if ( CHECKS )
			check(node);
		nYGNodeFree(node);
	}

	// --- [ YGNodeFreeRecursive ] ---

	public static native void nYGNodeFreeRecursive(long node);

	public static void YGNodeFreeRecursive(long node) {
		if ( CHECKS )
			check(node);
		nYGNodeFreeRecursive(node);
	}

	// --- [ YGNodeReset ] ---

	public static native void nYGNodeReset(long node);

	public static void YGNodeReset(long node) {
		if ( CHECKS )
			check(node);
		nYGNodeReset(node);
	}

	// --- [ YGNodeGetInstanceCount ] ---

	public static native int YGNodeGetInstanceCount();

	// --- [ YGNodeInsertChild ] ---

	public static native void nYGNodeInsertChild(long node, long child, int index);

	public static void YGNodeInsertChild(long node, long child, int index) {
		if ( CHECKS ) {
			check(node);
			check(child);
		}
		nYGNodeInsertChild(node, child, index);
	}

	// --- [ YGNodeRemoveChild ] ---

	public static native void nYGNodeRemoveChild(long node, long child);

	public static void YGNodeRemoveChild(long node, long child) {
		if ( CHECKS ) {
			check(node);
			check(child);
		}
		nYGNodeRemoveChild(node, child);
	}

	// --- [ YGNodeGetChild ] ---

	public static native long nYGNodeGetChild(long node, int index);

	public static long YGNodeGetChild(long node, int index) {
		if ( CHECKS )
			check(node);
		return nYGNodeGetChild(node, index);
	}

	// --- [ YGNodeGetParent ] ---

	public static native long nYGNodeGetParent(long node);

	public static long YGNodeGetParent(long node) {
		if ( CHECKS )
			check(node);
		return nYGNodeGetParent(node);
	}

	// --- [ YGNodeGetChildCount ] ---

	public static native int nYGNodeGetChildCount(long node);

	public static int YGNodeGetChildCount(long node) {
		if ( CHECKS )
			check(node);
		return nYGNodeGetChildCount(node);
	}

	// --- [ YGNodeCalculateLayout ] ---

	/** Unsafe version of: {@link #YGNodeCalculateLayout NodeCalculateLayout} */
	public static native void nYGNodeCalculateLayout(long node, float availableWidth, float availableHeight, int parentDirection);

	/**
	 * 
	 *
	 * @param node            
	 * @param availableWidth  
	 * @param availableHeight 
	 * @param parentDirection one of:<br><table><tr><td>{@link #YGDirectionInherit DirectionInherit}</td><td>{@link #YGDirectionLTR DirectionLTR}</td><td>{@link #YGDirectionRTL DirectionRTL}</td></tr></table>
	 */
	public static void YGNodeCalculateLayout(long node, float availableWidth, float availableHeight, int parentDirection) {
		if ( CHECKS )
			check(node);
		nYGNodeCalculateLayout(node, availableWidth, availableHeight, parentDirection);
	}

	// --- [ YGNodeMarkDirty ] ---

	/** Unsafe version of: {@link #YGNodeMarkDirty NodeMarkDirty} */
	public static native void nYGNodeMarkDirty(long node);

	/**
	 * Marks a node as dirty.
	 * 
	 * <p>Only valid for nodes with a custom measure function set. YG knows when to mark all other nodes as dirty but because nodes with measure functions
	 * depends on information not known to YG they must perform this dirty marking manually.</p>
	 *
	 * @param node 
	 */
	public static void YGNodeMarkDirty(long node) {
		if ( CHECKS )
			check(node);
		nYGNodeMarkDirty(node);
	}

	// --- [ YGNodeIsDirty ] ---

	public static native boolean nYGNodeIsDirty(long node);

	public static boolean YGNodeIsDirty(long node) {
		if ( CHECKS )
			check(node);
		return nYGNodeIsDirty(node);
	}

	// --- [ YGNodePrint ] ---

	/** Unsafe version of: {@link #YGNodePrint NodePrint} */
	public static native void nYGNodePrint(long node, int options);

	/**
	 * 
	 *
	 * @param node    
	 * @param options one of:<br><table><tr><td>{@link #YGPrintOptionsLayout PrintOptionsLayout}</td><td>{@link #YGPrintOptionsStyle PrintOptionsStyle}</td><td>{@link #YGPrintOptionsChildren PrintOptionsChildren}</td></tr></table>
	 */
	public static void YGNodePrint(long node, int options) {
		if ( CHECKS )
			check(node);
		nYGNodePrint(node, options);
	}

	// --- [ YGFloatIsUndefined ] ---

	public static native boolean YGFloatIsUndefined(float value);

	// --- [ YGNodeCanUseCachedMeasurement ] ---

	/**
	 * 
	 *
	 * @param widthMode          one of:<br><table><tr><td>{@link #YGMeasureModeUndefined MeasureModeUndefined}</td><td>{@link #YGMeasureModeExactly MeasureModeExactly}</td><td>{@link #YGMeasureModeAtMost MeasureModeAtMost}</td></tr></table>
	 * @param width              
	 * @param heightMode         
	 * @param height             
	 * @param lastWidthMode      
	 * @param lastWidth          
	 * @param lastHeightMode     
	 * @param lastHeight         
	 * @param lastComputedWidth  
	 * @param lastComputedHeight 
	 * @param marginRow          
	 * @param marginColumn       
	 */
	public static native boolean YGNodeCanUseCachedMeasurement(int widthMode, float width, int heightMode, float height, int lastWidthMode, float lastWidth, int lastHeightMode, float lastHeight, float lastComputedWidth, float lastComputedHeight, float marginRow, float marginColumn);

	// --- [ YGNodeCopyStyle ] ---

	public static native void nYGNodeCopyStyle(long dstNode, long srcNode);

	public static void YGNodeCopyStyle(long dstNode, long srcNode) {
		if ( CHECKS ) {
			check(dstNode);
			check(srcNode);
		}
		nYGNodeCopyStyle(dstNode, srcNode);
	}

	// --- [ YGNodeSetContext ] ---

	public static native void nYGNodeSetContext(long node, long context);

	public static void YGNodeSetContext(long node, long context) {
		if ( CHECKS ) {
			check(node);
			check(context);
		}
		nYGNodeSetContext(node, context);
	}

	// --- [ YGNodeGetContext ] ---

	public static native long nYGNodeGetContext(long node);

	public static long YGNodeGetContext(long node) {
		if ( CHECKS )
			check(node);
		return nYGNodeGetContext(node);
	}

	// --- [ YGNodeSetMeasureFunc ] ---

	public static native void nYGNodeSetMeasureFunc(long node, long measureFunc);

	public static void YGNodeSetMeasureFunc(long node, YGMeasureFuncI measureFunc) {
		if ( CHECKS )
			check(node);
		nYGNodeSetMeasureFunc(node, measureFunc.address());
	}

	// --- [ YGNodeGetMeasureFunc ] ---

	public static native long nYGNodeGetMeasureFunc(long node);

	public static YGMeasureFunc YGNodeGetMeasureFunc(long node) {
		if ( CHECKS )
			check(node);
		return YGMeasureFunc.create(nYGNodeGetMeasureFunc(node));
	}

	// --- [ YGNodeSetBaselineFunc ] ---

	public static native void nYGNodeSetBaselineFunc(long node, long baselineFunc);

	public static void YGNodeSetBaselineFunc(long node, YGBaselineFuncI baselineFunc) {
		if ( CHECKS )
			check(node);
		nYGNodeSetBaselineFunc(node, baselineFunc.address());
	}

	// --- [ YGNodeGetBaselineFunc ] ---

	public static native long nYGNodeGetBaselineFunc(long node);

	public static YGBaselineFunc YGNodeGetBaselineFunc(long node) {
		if ( CHECKS )
			check(node);
		return YGBaselineFunc.create(nYGNodeGetBaselineFunc(node));
	}

	// --- [ YGNodeSetPrintFunc ] ---

	public static native void nYGNodeSetPrintFunc(long node, long printFunc);

	public static void YGNodeSetPrintFunc(long node, YGPrintFuncI printFunc) {
		if ( CHECKS )
			check(node);
		nYGNodeSetPrintFunc(node, printFunc.address());
	}

	// --- [ YGNodeGetPrintFunc ] ---

	public static native long nYGNodeGetPrintFunc(long node);

	public static YGPrintFunc YGNodeGetPrintFunc(long node) {
		if ( CHECKS )
			check(node);
		return YGPrintFunc.create(nYGNodeGetPrintFunc(node));
	}

	// --- [ YGNodeSetHasNewLayout ] ---

	public static native void nYGNodeSetHasNewLayout(long node, boolean hasNewLayout);

	public static void YGNodeSetHasNewLayout(long node, boolean hasNewLayout) {
		if ( CHECKS )
			check(node);
		nYGNodeSetHasNewLayout(node, hasNewLayout);
	}

	// --- [ YGNodeGetHasNewLayout ] ---

	public static native boolean nYGNodeGetHasNewLayout(long node);

	public static boolean YGNodeGetHasNewLayout(long node) {
		if ( CHECKS )
			check(node);
		return nYGNodeGetHasNewLayout(node);
	}

	// --- [ YGNodeStyleSetDirection ] ---

	/** Unsafe version of: {@link #YGNodeStyleSetDirection NodeStyleSetDirection} */
	public static native void nYGNodeStyleSetDirection(long node, int direction);

	/**
	 * 
	 *
	 * @param node      
	 * @param direction one of:<br><table><tr><td>{@link #YGDirectionInherit DirectionInherit}</td><td>{@link #YGDirectionLTR DirectionLTR}</td><td>{@link #YGDirectionRTL DirectionRTL}</td></tr></table>
	 */
	public static void YGNodeStyleSetDirection(long node, int direction) {
		if ( CHECKS )
			check(node);
		nYGNodeStyleSetDirection(node, direction);
	}

	// --- [ YGNodeStyleGetDirection ] ---

	public static native int nYGNodeStyleGetDirection(long node);

	public static int YGNodeStyleGetDirection(long node) {
		if ( CHECKS )
			check(node);
		return nYGNodeStyleGetDirection(node);
	}

	// --- [ YGNodeStyleSetFlexDirection ] ---

	/** Unsafe version of: {@link #YGNodeStyleSetFlexDirection NodeStyleSetFlexDirection} */
	public static native void nYGNodeStyleSetFlexDirection(long node, int flexDirection);

	/**
	 * 
	 *
	 * @param node          
	 * @param flexDirection one of:<br><table><tr><td>{@link #YGFlexDirectionColumn FlexDirectionColumn}</td><td>{@link #YGFlexDirectionColumnReverse FlexDirectionColumnReverse}</td><td>{@link #YGFlexDirectionRow FlexDirectionRow}</td></tr><tr><td>{@link #YGFlexDirectionRowReverse FlexDirectionRowReverse}</td></tr></table>
	 */
	public static void YGNodeStyleSetFlexDirection(long node, int flexDirection) {
		if ( CHECKS )
			check(node);
		nYGNodeStyleSetFlexDirection(node, flexDirection);
	}

	// --- [ YGNodeStyleGetFlexDirection ] ---

	public static native int nYGNodeStyleGetFlexDirection(long node);

	public static int YGNodeStyleGetFlexDirection(long node) {
		if ( CHECKS )
			check(node);
		return nYGNodeStyleGetFlexDirection(node);
	}

	// --- [ YGNodeStyleSetJustifyContent ] ---

	/** Unsafe version of: {@link #YGNodeStyleSetJustifyContent NodeStyleSetJustifyContent} */
	public static native void nYGNodeStyleSetJustifyContent(long node, int justifyContent);

	/**
	 * 
	 *
	 * @param node           
	 * @param justifyContent one of:<br><table><tr><td>{@link #YGJustifyFlexStart JustifyFlexStart}</td><td>{@link #YGJustifyCenter JustifyCenter}</td><td>{@link #YGJustifyFlexEnd JustifyFlexEnd}</td><td>{@link #YGJustifySpaceBetween JustifySpaceBetween}</td><td>{@link #YGJustifySpaceAround JustifySpaceAround}</td></tr></table>
	 */
	public static void YGNodeStyleSetJustifyContent(long node, int justifyContent) {
		if ( CHECKS )
			check(node);
		nYGNodeStyleSetJustifyContent(node, justifyContent);
	}

	// --- [ YGNodeStyleGetJustifyContent ] ---

	public static native int nYGNodeStyleGetJustifyContent(long node);

	public static int YGNodeStyleGetJustifyContent(long node) {
		if ( CHECKS )
			check(node);
		return nYGNodeStyleGetJustifyContent(node);
	}

	// --- [ YGNodeStyleSetAlignContent ] ---

	/** Unsafe version of: {@link #YGNodeStyleSetAlignContent NodeStyleSetAlignContent} */
	public static native void nYGNodeStyleSetAlignContent(long node, int alignContent);

	/**
	 * 
	 *
	 * @param node         
	 * @param alignContent one of:<br><table><tr><td>{@link #YGAlignAuto AlignAuto}</td><td>{@link #YGAlignFlexStart AlignFlexStart}</td><td>{@link #YGAlignCenter AlignCenter}</td><td>{@link #YGAlignFlexEnd AlignFlexEnd}</td><td>{@link #YGAlignStretch AlignStretch}</td><td>{@link #YGAlignBaseline AlignBaseline}</td></tr><tr><td>{@link #YGAlignSpaceBetween AlignSpaceBetween}</td><td>{@link #YGAlignSpaceAround AlignSpaceAround}</td></tr></table>
	 */
	public static void YGNodeStyleSetAlignContent(long node, int alignContent) {
		if ( CHECKS )
			check(node);
		nYGNodeStyleSetAlignContent(node, alignContent);
	}

	// --- [ YGNodeStyleGetAlignContent ] ---

	public static native int nYGNodeStyleGetAlignContent(long node);

	public static int YGNodeStyleGetAlignContent(long node) {
		if ( CHECKS )
			check(node);
		return nYGNodeStyleGetAlignContent(node);
	}

	// --- [ YGNodeStyleSetAlignItems ] ---

	/** Unsafe version of: {@link #YGNodeStyleSetAlignItems NodeStyleSetAlignItems} */
	public static native void nYGNodeStyleSetAlignItems(long node, int alignItems);

	/**
	 * 
	 *
	 * @param node       
	 * @param alignItems one of:<br><table><tr><td>{@link #YGAlignAuto AlignAuto}</td><td>{@link #YGAlignFlexStart AlignFlexStart}</td><td>{@link #YGAlignCenter AlignCenter}</td><td>{@link #YGAlignFlexEnd AlignFlexEnd}</td><td>{@link #YGAlignStretch AlignStretch}</td><td>{@link #YGAlignBaseline AlignBaseline}</td></tr><tr><td>{@link #YGAlignSpaceBetween AlignSpaceBetween}</td><td>{@link #YGAlignSpaceAround AlignSpaceAround}</td></tr></table>
	 */
	public static void YGNodeStyleSetAlignItems(long node, int alignItems) {
		if ( CHECKS )
			check(node);
		nYGNodeStyleSetAlignItems(node, alignItems);
	}

	// --- [ YGNodeStyleGetAlignItems ] ---

	public static native int nYGNodeStyleGetAlignItems(long node);

	public static int YGNodeStyleGetAlignItems(long node) {
		if ( CHECKS )
			check(node);
		return nYGNodeStyleGetAlignItems(node);
	}

	// --- [ YGNodeStyleSetAlignSelf ] ---

	/** Unsafe version of: {@link #YGNodeStyleSetAlignSelf NodeStyleSetAlignSelf} */
	public static native void nYGNodeStyleSetAlignSelf(long node, int alignSelf);

	/**
	 * 
	 *
	 * @param node      
	 * @param alignSelf one of:<br><table><tr><td>{@link #YGAlignAuto AlignAuto}</td><td>{@link #YGAlignFlexStart AlignFlexStart}</td><td>{@link #YGAlignCenter AlignCenter}</td><td>{@link #YGAlignFlexEnd AlignFlexEnd}</td><td>{@link #YGAlignStretch AlignStretch}</td><td>{@link #YGAlignBaseline AlignBaseline}</td></tr><tr><td>{@link #YGAlignSpaceBetween AlignSpaceBetween}</td><td>{@link #YGAlignSpaceAround AlignSpaceAround}</td></tr></table>
	 */
	public static void YGNodeStyleSetAlignSelf(long node, int alignSelf) {
		if ( CHECKS )
			check(node);
		nYGNodeStyleSetAlignSelf(node, alignSelf);
	}

	// --- [ YGNodeStyleGetAlignSelf ] ---

	public static native int nYGNodeStyleGetAlignSelf(long node);

	public static int YGNodeStyleGetAlignSelf(long node) {
		if ( CHECKS )
			check(node);
		return nYGNodeStyleGetAlignSelf(node);
	}

	// --- [ YGNodeStyleSetPositionType ] ---

	/** Unsafe version of: {@link #YGNodeStyleSetPositionType NodeStyleSetPositionType} */
	public static native void nYGNodeStyleSetPositionType(long node, int positionType);

	/**
	 * 
	 *
	 * @param node         
	 * @param positionType one of:<br><table><tr><td>{@link #YGPositionTypeRelative PositionTypeRelative}</td><td>{@link #YGPositionTypeAbsolute PositionTypeAbsolute}</td></tr></table>
	 */
	public static void YGNodeStyleSetPositionType(long node, int positionType) {
		if ( CHECKS )
			check(node);
		nYGNodeStyleSetPositionType(node, positionType);
	}

	// --- [ YGNodeStyleGetPositionType ] ---

	public static native int nYGNodeStyleGetPositionType(long node);

	public static int YGNodeStyleGetPositionType(long node) {
		if ( CHECKS )
			check(node);
		return nYGNodeStyleGetPositionType(node);
	}

	// --- [ YGNodeStyleSetFlexWrap ] ---

	/** Unsafe version of: {@link #YGNodeStyleSetFlexWrap NodeStyleSetFlexWrap} */
	public static native void nYGNodeStyleSetFlexWrap(long node, int flexWrap);

	/**
	 * 
	 *
	 * @param node     
	 * @param flexWrap one of:<br><table><tr><td>{@link #YGWrapNoWrap WrapNoWrap}</td><td>{@link #YGWrapWrap WrapWrap}</td><td>{@link #YGWrapReverse WrapReverse}</td></tr></table>
	 */
	public static void YGNodeStyleSetFlexWrap(long node, int flexWrap) {
		if ( CHECKS )
			check(node);
		nYGNodeStyleSetFlexWrap(node, flexWrap);
	}

	// --- [ YGNodeStyleGetFlexWrap ] ---

	public static native int nYGNodeStyleGetFlexWrap(long node);

	public static int YGNodeStyleGetFlexWrap(long node) {
		if ( CHECKS )
			check(node);
		return nYGNodeStyleGetFlexWrap(node);
	}

	// --- [ YGNodeStyleSetOverflow ] ---

	/** Unsafe version of: {@link #YGNodeStyleSetOverflow NodeStyleSetOverflow} */
	public static native void nYGNodeStyleSetOverflow(long node, int overflow);

	/**
	 * 
	 *
	 * @param node     
	 * @param overflow one of:<br><table><tr><td>{@link #YGOverflowVisible OverflowVisible}</td><td>{@link #YGOverflowHidden OverflowHidden}</td><td>{@link #YGOverflowScroll OverflowScroll}</td></tr></table>
	 */
	public static void YGNodeStyleSetOverflow(long node, int overflow) {
		if ( CHECKS )
			check(node);
		nYGNodeStyleSetOverflow(node, overflow);
	}

	// --- [ YGNodeStyleGetOverflow ] ---

	public static native int nYGNodeStyleGetOverflow(long node);

	public static int YGNodeStyleGetOverflow(long node) {
		if ( CHECKS )
			check(node);
		return nYGNodeStyleGetOverflow(node);
	}

	// --- [ YGNodeStyleSetDisplay ] ---

	/** Unsafe version of: {@link #YGNodeStyleSetDisplay NodeStyleSetDisplay} */
	public static native void nYGNodeStyleSetDisplay(long node, int display);

	/**
	 * 
	 *
	 * @param node    
	 * @param display one of:<br><table><tr><td>{@link #YGDisplayFlex DisplayFlex}</td><td>{@link #YGDisplayNone DisplayNone}</td></tr></table>
	 */
	public static void YGNodeStyleSetDisplay(long node, int display) {
		if ( CHECKS )
			check(node);
		nYGNodeStyleSetDisplay(node, display);
	}

	// --- [ YGNodeStyleGetDisplay ] ---

	public static native int nYGNodeStyleGetDisplay(long node);

	public static int YGNodeStyleGetDisplay(long node) {
		if ( CHECKS )
			check(node);
		return nYGNodeStyleGetDisplay(node);
	}

	// --- [ YGNodeStyleSetFlex ] ---

	public static native void nYGNodeStyleSetFlex(long node, float flex);

	public static void YGNodeStyleSetFlex(long node, float flex) {
		if ( CHECKS )
			check(node);
		nYGNodeStyleSetFlex(node, flex);
	}

	// --- [ YGNodeStyleSetFlexGrow ] ---

	public static native void nYGNodeStyleSetFlexGrow(long node, float flexGrow);

	public static void YGNodeStyleSetFlexGrow(long node, float flexGrow) {
		if ( CHECKS )
			check(node);
		nYGNodeStyleSetFlexGrow(node, flexGrow);
	}

	// --- [ YGNodeStyleGetFlexGrow ] ---

	public static native float nYGNodeStyleGetFlexGrow(long node);

	public static float YGNodeStyleGetFlexGrow(long node) {
		if ( CHECKS )
			check(node);
		return nYGNodeStyleGetFlexGrow(node);
	}

	// --- [ YGNodeStyleSetFlexShrink ] ---

	public static native void nYGNodeStyleSetFlexShrink(long node, float flexShrink);

	public static void YGNodeStyleSetFlexShrink(long node, float flexShrink) {
		if ( CHECKS )
			check(node);
		nYGNodeStyleSetFlexShrink(node, flexShrink);
	}

	// --- [ YGNodeStyleGetFlexShrink ] ---

	public static native float nYGNodeStyleGetFlexShrink(long node);

	public static float YGNodeStyleGetFlexShrink(long node) {
		if ( CHECKS )
			check(node);
		return nYGNodeStyleGetFlexShrink(node);
	}

	// --- [ YGNodeStyleSetFlexBasis ] ---

	public static native void nYGNodeStyleSetFlexBasis(long node, float flexBasis);

	public static void YGNodeStyleSetFlexBasis(long node, float flexBasis) {
		if ( CHECKS )
			check(node);
		nYGNodeStyleSetFlexBasis(node, flexBasis);
	}

	// --- [ YGNodeStyleSetFlexBasisPercent ] ---

	public static native void nYGNodeStyleSetFlexBasisPercent(long node, float flexBasis);

	public static void YGNodeStyleSetFlexBasisPercent(long node, float flexBasis) {
		if ( CHECKS )
			check(node);
		nYGNodeStyleSetFlexBasisPercent(node, flexBasis);
	}

	// --- [ YGNodeStyleGetFlexBasis ] ---

	public static native void nYGNodeStyleGetFlexBasis(long node, long __result);

	public static YGValue YGNodeStyleGetFlexBasis(long node, YGValue __result) {
		if ( CHECKS )
			check(node);
		nYGNodeStyleGetFlexBasis(node, __result.address());
		return __result;
	}

	// --- [ YGNodeStyleSetFlexBasisAuto ] ---

	public static native void nYGNodeStyleSetFlexBasisAuto(long node);

	public static void YGNodeStyleSetFlexBasisAuto(long node) {
		if ( CHECKS )
			check(node);
		nYGNodeStyleSetFlexBasisAuto(node);
	}

	// --- [ YGNodeStyleSetPosition ] ---

	/** Unsafe version of: {@link #YGNodeStyleSetPosition NodeStyleSetPosition} */
	public static native void nYGNodeStyleSetPosition(long node, int edge, float position);

	/**
	 * 
	 *
	 * @param node     
	 * @param edge     one of:<br><table><tr><td>{@link #YGEdgeLeft EdgeLeft}</td><td>{@link #YGEdgeTop EdgeTop}</td><td>{@link #YGEdgeRight EdgeRight}</td><td>{@link #YGEdgeBottom EdgeBottom}</td><td>{@link #YGEdgeStart EdgeStart}</td><td>{@link #YGEdgeEnd EdgeEnd}</td><td>{@link #YGEdgeHorizontal EdgeHorizontal}</td><td>{@link #YGEdgeVertical EdgeVertical}</td></tr><tr><td>{@link #YGEdgeAll EdgeAll}</td></tr></table>
	 * @param position 
	 */
	public static void YGNodeStyleSetPosition(long node, int edge, float position) {
		if ( CHECKS )
			check(node);
		nYGNodeStyleSetPosition(node, edge, position);
	}

	// --- [ YGNodeStyleSetPositionPercent ] ---

	/** Unsafe version of: {@link #YGNodeStyleSetPositionPercent NodeStyleSetPositionPercent} */
	public static native void nYGNodeStyleSetPositionPercent(long node, int edge, float position);

	/**
	 * 
	 *
	 * @param node     
	 * @param edge     one of:<br><table><tr><td>{@link #YGEdgeLeft EdgeLeft}</td><td>{@link #YGEdgeTop EdgeTop}</td><td>{@link #YGEdgeRight EdgeRight}</td><td>{@link #YGEdgeBottom EdgeBottom}</td><td>{@link #YGEdgeStart EdgeStart}</td><td>{@link #YGEdgeEnd EdgeEnd}</td><td>{@link #YGEdgeHorizontal EdgeHorizontal}</td><td>{@link #YGEdgeVertical EdgeVertical}</td></tr><tr><td>{@link #YGEdgeAll EdgeAll}</td></tr></table>
	 * @param position 
	 */
	public static void YGNodeStyleSetPositionPercent(long node, int edge, float position) {
		if ( CHECKS )
			check(node);
		nYGNodeStyleSetPositionPercent(node, edge, position);
	}

	// --- [ YGNodeStyleGetPosition ] ---

	/** Unsafe version of: {@link #YGNodeStyleGetPosition NodeStyleGetPosition} */
	public static native void nYGNodeStyleGetPosition(long node, int edge, long __result);

	/**
	 * 
	 *
	 * @param node 
	 * @param edge one of:<br><table><tr><td>{@link #YGEdgeLeft EdgeLeft}</td><td>{@link #YGEdgeTop EdgeTop}</td><td>{@link #YGEdgeRight EdgeRight}</td><td>{@link #YGEdgeBottom EdgeBottom}</td><td>{@link #YGEdgeStart EdgeStart}</td><td>{@link #YGEdgeEnd EdgeEnd}</td><td>{@link #YGEdgeHorizontal EdgeHorizontal}</td><td>{@link #YGEdgeVertical EdgeVertical}</td></tr><tr><td>{@link #YGEdgeAll EdgeAll}</td></tr></table>
	 */
	public static YGValue YGNodeStyleGetPosition(long node, int edge, YGValue __result) {
		if ( CHECKS )
			check(node);
		nYGNodeStyleGetPosition(node, edge, __result.address());
		return __result;
	}

	// --- [ YGNodeStyleSetMargin ] ---

	/** Unsafe version of: {@link #YGNodeStyleSetMargin NodeStyleSetMargin} */
	public static native void nYGNodeStyleSetMargin(long node, int edge, float margin);

	/**
	 * 
	 *
	 * @param node   
	 * @param edge   one of:<br><table><tr><td>{@link #YGEdgeLeft EdgeLeft}</td><td>{@link #YGEdgeTop EdgeTop}</td><td>{@link #YGEdgeRight EdgeRight}</td><td>{@link #YGEdgeBottom EdgeBottom}</td><td>{@link #YGEdgeStart EdgeStart}</td><td>{@link #YGEdgeEnd EdgeEnd}</td><td>{@link #YGEdgeHorizontal EdgeHorizontal}</td><td>{@link #YGEdgeVertical EdgeVertical}</td></tr><tr><td>{@link #YGEdgeAll EdgeAll}</td></tr></table>
	 * @param margin 
	 */
	public static void YGNodeStyleSetMargin(long node, int edge, float margin) {
		if ( CHECKS )
			check(node);
		nYGNodeStyleSetMargin(node, edge, margin);
	}

	// --- [ YGNodeStyleSetMarginPercent ] ---

	/** Unsafe version of: {@link #YGNodeStyleSetMarginPercent NodeStyleSetMarginPercent} */
	public static native void nYGNodeStyleSetMarginPercent(long node, int edge, float margin);

	/**
	 * 
	 *
	 * @param node   
	 * @param edge   one of:<br><table><tr><td>{@link #YGEdgeLeft EdgeLeft}</td><td>{@link #YGEdgeTop EdgeTop}</td><td>{@link #YGEdgeRight EdgeRight}</td><td>{@link #YGEdgeBottom EdgeBottom}</td><td>{@link #YGEdgeStart EdgeStart}</td><td>{@link #YGEdgeEnd EdgeEnd}</td><td>{@link #YGEdgeHorizontal EdgeHorizontal}</td><td>{@link #YGEdgeVertical EdgeVertical}</td></tr><tr><td>{@link #YGEdgeAll EdgeAll}</td></tr></table>
	 * @param margin 
	 */
	public static void YGNodeStyleSetMarginPercent(long node, int edge, float margin) {
		if ( CHECKS )
			check(node);
		nYGNodeStyleSetMarginPercent(node, edge, margin);
	}

	// --- [ YGNodeStyleGetMargin ] ---

	/** Unsafe version of: {@link #YGNodeStyleGetMargin NodeStyleGetMargin} */
	public static native void nYGNodeStyleGetMargin(long node, int edge, long __result);

	/**
	 * 
	 *
	 * @param node 
	 * @param edge one of:<br><table><tr><td>{@link #YGEdgeLeft EdgeLeft}</td><td>{@link #YGEdgeTop EdgeTop}</td><td>{@link #YGEdgeRight EdgeRight}</td><td>{@link #YGEdgeBottom EdgeBottom}</td><td>{@link #YGEdgeStart EdgeStart}</td><td>{@link #YGEdgeEnd EdgeEnd}</td><td>{@link #YGEdgeHorizontal EdgeHorizontal}</td><td>{@link #YGEdgeVertical EdgeVertical}</td></tr><tr><td>{@link #YGEdgeAll EdgeAll}</td></tr></table>
	 */
	public static YGValue YGNodeStyleGetMargin(long node, int edge, YGValue __result) {
		if ( CHECKS )
			check(node);
		nYGNodeStyleGetMargin(node, edge, __result.address());
		return __result;
	}

	// --- [ YGNodeStyleSetMarginAuto ] ---

	/** Unsafe version of: {@link #YGNodeStyleSetMarginAuto NodeStyleSetMarginAuto} */
	public static native void nYGNodeStyleSetMarginAuto(long node, int edge);

	/**
	 * 
	 *
	 * @param node 
	 * @param edge one of:<br><table><tr><td>{@link #YGEdgeLeft EdgeLeft}</td><td>{@link #YGEdgeTop EdgeTop}</td><td>{@link #YGEdgeRight EdgeRight}</td><td>{@link #YGEdgeBottom EdgeBottom}</td><td>{@link #YGEdgeStart EdgeStart}</td><td>{@link #YGEdgeEnd EdgeEnd}</td><td>{@link #YGEdgeHorizontal EdgeHorizontal}</td><td>{@link #YGEdgeVertical EdgeVertical}</td></tr><tr><td>{@link #YGEdgeAll EdgeAll}</td></tr></table>
	 */
	public static void YGNodeStyleSetMarginAuto(long node, int edge) {
		if ( CHECKS )
			check(node);
		nYGNodeStyleSetMarginAuto(node, edge);
	}

	// --- [ YGNodeStyleSetPadding ] ---

	/** Unsafe version of: {@link #YGNodeStyleSetPadding NodeStyleSetPadding} */
	public static native void nYGNodeStyleSetPadding(long node, int edge, float padding);

	/**
	 * 
	 *
	 * @param node    
	 * @param edge    one of:<br><table><tr><td>{@link #YGEdgeLeft EdgeLeft}</td><td>{@link #YGEdgeTop EdgeTop}</td><td>{@link #YGEdgeRight EdgeRight}</td><td>{@link #YGEdgeBottom EdgeBottom}</td><td>{@link #YGEdgeStart EdgeStart}</td><td>{@link #YGEdgeEnd EdgeEnd}</td><td>{@link #YGEdgeHorizontal EdgeHorizontal}</td><td>{@link #YGEdgeVertical EdgeVertical}</td></tr><tr><td>{@link #YGEdgeAll EdgeAll}</td></tr></table>
	 * @param padding 
	 */
	public static void YGNodeStyleSetPadding(long node, int edge, float padding) {
		if ( CHECKS )
			check(node);
		nYGNodeStyleSetPadding(node, edge, padding);
	}

	// --- [ YGNodeStyleSetPaddingPercent ] ---

	/** Unsafe version of: {@link #YGNodeStyleSetPaddingPercent NodeStyleSetPaddingPercent} */
	public static native void nYGNodeStyleSetPaddingPercent(long node, int edge, float padding);

	/**
	 * 
	 *
	 * @param node    
	 * @param edge    one of:<br><table><tr><td>{@link #YGEdgeLeft EdgeLeft}</td><td>{@link #YGEdgeTop EdgeTop}</td><td>{@link #YGEdgeRight EdgeRight}</td><td>{@link #YGEdgeBottom EdgeBottom}</td><td>{@link #YGEdgeStart EdgeStart}</td><td>{@link #YGEdgeEnd EdgeEnd}</td><td>{@link #YGEdgeHorizontal EdgeHorizontal}</td><td>{@link #YGEdgeVertical EdgeVertical}</td></tr><tr><td>{@link #YGEdgeAll EdgeAll}</td></tr></table>
	 * @param padding 
	 */
	public static void YGNodeStyleSetPaddingPercent(long node, int edge, float padding) {
		if ( CHECKS )
			check(node);
		nYGNodeStyleSetPaddingPercent(node, edge, padding);
	}

	// --- [ YGNodeStyleGetPadding ] ---

	/** Unsafe version of: {@link #YGNodeStyleGetPadding NodeStyleGetPadding} */
	public static native void nYGNodeStyleGetPadding(long node, int edge, long __result);

	/**
	 * 
	 *
	 * @param node 
	 * @param edge one of:<br><table><tr><td>{@link #YGEdgeLeft EdgeLeft}</td><td>{@link #YGEdgeTop EdgeTop}</td><td>{@link #YGEdgeRight EdgeRight}</td><td>{@link #YGEdgeBottom EdgeBottom}</td><td>{@link #YGEdgeStart EdgeStart}</td><td>{@link #YGEdgeEnd EdgeEnd}</td><td>{@link #YGEdgeHorizontal EdgeHorizontal}</td><td>{@link #YGEdgeVertical EdgeVertical}</td></tr><tr><td>{@link #YGEdgeAll EdgeAll}</td></tr></table>
	 */
	public static YGValue YGNodeStyleGetPadding(long node, int edge, YGValue __result) {
		if ( CHECKS )
			check(node);
		nYGNodeStyleGetPadding(node, edge, __result.address());
		return __result;
	}

	// --- [ YGNodeStyleSetBorder ] ---

	/** Unsafe version of: {@link #YGNodeStyleSetBorder NodeStyleSetBorder} */
	public static native void nYGNodeStyleSetBorder(long node, int edge, float border);

	/**
	 * 
	 *
	 * @param node   
	 * @param edge   one of:<br><table><tr><td>{@link #YGEdgeLeft EdgeLeft}</td><td>{@link #YGEdgeTop EdgeTop}</td><td>{@link #YGEdgeRight EdgeRight}</td><td>{@link #YGEdgeBottom EdgeBottom}</td><td>{@link #YGEdgeStart EdgeStart}</td><td>{@link #YGEdgeEnd EdgeEnd}</td><td>{@link #YGEdgeHorizontal EdgeHorizontal}</td><td>{@link #YGEdgeVertical EdgeVertical}</td></tr><tr><td>{@link #YGEdgeAll EdgeAll}</td></tr></table>
	 * @param border 
	 */
	public static void YGNodeStyleSetBorder(long node, int edge, float border) {
		if ( CHECKS )
			check(node);
		nYGNodeStyleSetBorder(node, edge, border);
	}

	// --- [ YGNodeStyleGetBorder ] ---

	/** Unsafe version of: {@link #YGNodeStyleGetBorder NodeStyleGetBorder} */
	public static native float nYGNodeStyleGetBorder(long node, int edge);

	/**
	 * 
	 *
	 * @param node 
	 * @param edge one of:<br><table><tr><td>{@link #YGEdgeLeft EdgeLeft}</td><td>{@link #YGEdgeTop EdgeTop}</td><td>{@link #YGEdgeRight EdgeRight}</td><td>{@link #YGEdgeBottom EdgeBottom}</td><td>{@link #YGEdgeStart EdgeStart}</td><td>{@link #YGEdgeEnd EdgeEnd}</td><td>{@link #YGEdgeHorizontal EdgeHorizontal}</td><td>{@link #YGEdgeVertical EdgeVertical}</td></tr><tr><td>{@link #YGEdgeAll EdgeAll}</td></tr></table>
	 */
	public static float YGNodeStyleGetBorder(long node, int edge) {
		if ( CHECKS )
			check(node);
		return nYGNodeStyleGetBorder(node, edge);
	}

	// --- [ YGNodeStyleSetWidth ] ---

	public static native void nYGNodeStyleSetWidth(long node, float width);

	public static void YGNodeStyleSetWidth(long node, float width) {
		if ( CHECKS )
			check(node);
		nYGNodeStyleSetWidth(node, width);
	}

	// --- [ YGNodeStyleSetWidthPercent ] ---

	public static native void nYGNodeStyleSetWidthPercent(long node, float width);

	public static void YGNodeStyleSetWidthPercent(long node, float width) {
		if ( CHECKS )
			check(node);
		nYGNodeStyleSetWidthPercent(node, width);
	}

	// --- [ YGNodeStyleGetWidth ] ---

	public static native void nYGNodeStyleGetWidth(long node, long __result);

	public static YGValue YGNodeStyleGetWidth(long node, YGValue __result) {
		if ( CHECKS )
			check(node);
		nYGNodeStyleGetWidth(node, __result.address());
		return __result;
	}

	// --- [ YGNodeStyleSetWidthAuto ] ---

	public static native void nYGNodeStyleSetWidthAuto(long node);

	public static void YGNodeStyleSetWidthAuto(long node) {
		if ( CHECKS )
			check(node);
		nYGNodeStyleSetWidthAuto(node);
	}

	// --- [ YGNodeStyleSetHeight ] ---

	public static native void nYGNodeStyleSetHeight(long node, float height);

	public static void YGNodeStyleSetHeight(long node, float height) {
		if ( CHECKS )
			check(node);
		nYGNodeStyleSetHeight(node, height);
	}

	// --- [ YGNodeStyleSetHeightPercent ] ---

	public static native void nYGNodeStyleSetHeightPercent(long node, float height);

	public static void YGNodeStyleSetHeightPercent(long node, float height) {
		if ( CHECKS )
			check(node);
		nYGNodeStyleSetHeightPercent(node, height);
	}

	// --- [ YGNodeStyleGetHeight ] ---

	public static native void nYGNodeStyleGetHeight(long node, long __result);

	public static YGValue YGNodeStyleGetHeight(long node, YGValue __result) {
		if ( CHECKS )
			check(node);
		nYGNodeStyleGetHeight(node, __result.address());
		return __result;
	}

	// --- [ YGNodeStyleSetHeightAuto ] ---

	public static native void nYGNodeStyleSetHeightAuto(long node);

	public static void YGNodeStyleSetHeightAuto(long node) {
		if ( CHECKS )
			check(node);
		nYGNodeStyleSetHeightAuto(node);
	}

	// --- [ YGNodeStyleSetMinWidth ] ---

	public static native void nYGNodeStyleSetMinWidth(long node, float minWidth);

	public static void YGNodeStyleSetMinWidth(long node, float minWidth) {
		if ( CHECKS )
			check(node);
		nYGNodeStyleSetMinWidth(node, minWidth);
	}

	// --- [ YGNodeStyleSetMinWidthPercent ] ---

	public static native void nYGNodeStyleSetMinWidthPercent(long node, float minWidth);

	public static void YGNodeStyleSetMinWidthPercent(long node, float minWidth) {
		if ( CHECKS )
			check(node);
		nYGNodeStyleSetMinWidthPercent(node, minWidth);
	}

	// --- [ YGNodeStyleGetMinWidth ] ---

	public static native void nYGNodeStyleGetMinWidth(long node, long __result);

	public static YGValue YGNodeStyleGetMinWidth(long node, YGValue __result) {
		if ( CHECKS )
			check(node);
		nYGNodeStyleGetMinWidth(node, __result.address());
		return __result;
	}

	// --- [ YGNodeStyleSetMinHeight ] ---

	public static native void nYGNodeStyleSetMinHeight(long node, float minHeight);

	public static void YGNodeStyleSetMinHeight(long node, float minHeight) {
		if ( CHECKS )
			check(node);
		nYGNodeStyleSetMinHeight(node, minHeight);
	}

	// --- [ YGNodeStyleSetMinHeightPercent ] ---

	public static native void nYGNodeStyleSetMinHeightPercent(long node, float minHeight);

	public static void YGNodeStyleSetMinHeightPercent(long node, float minHeight) {
		if ( CHECKS )
			check(node);
		nYGNodeStyleSetMinHeightPercent(node, minHeight);
	}

	// --- [ YGNodeStyleGetMinHeight ] ---

	public static native void nYGNodeStyleGetMinHeight(long node, long __result);

	public static YGValue YGNodeStyleGetMinHeight(long node, YGValue __result) {
		if ( CHECKS )
			check(node);
		nYGNodeStyleGetMinHeight(node, __result.address());
		return __result;
	}

	// --- [ YGNodeStyleSetMaxWidth ] ---

	public static native void nYGNodeStyleSetMaxWidth(long node, float maxWidth);

	public static void YGNodeStyleSetMaxWidth(long node, float maxWidth) {
		if ( CHECKS )
			check(node);
		nYGNodeStyleSetMaxWidth(node, maxWidth);
	}

	// --- [ YGNodeStyleSetMaxWidthPercent ] ---

	public static native void nYGNodeStyleSetMaxWidthPercent(long node, float maxWidth);

	public static void YGNodeStyleSetMaxWidthPercent(long node, float maxWidth) {
		if ( CHECKS )
			check(node);
		nYGNodeStyleSetMaxWidthPercent(node, maxWidth);
	}

	// --- [ YGNodeStyleGetMaxWidth ] ---

	public static native void nYGNodeStyleGetMaxWidth(long node, long __result);

	public static YGValue YGNodeStyleGetMaxWidth(long node, YGValue __result) {
		if ( CHECKS )
			check(node);
		nYGNodeStyleGetMaxWidth(node, __result.address());
		return __result;
	}

	// --- [ YGNodeStyleSetMaxHeight ] ---

	public static native void nYGNodeStyleSetMaxHeight(long node, float maxHeight);

	public static void YGNodeStyleSetMaxHeight(long node, float maxHeight) {
		if ( CHECKS )
			check(node);
		nYGNodeStyleSetMaxHeight(node, maxHeight);
	}

	// --- [ YGNodeStyleSetMaxHeightPercent ] ---

	public static native void nYGNodeStyleSetMaxHeightPercent(long node, float maxHeight);

	public static void YGNodeStyleSetMaxHeightPercent(long node, float maxHeight) {
		if ( CHECKS )
			check(node);
		nYGNodeStyleSetMaxHeightPercent(node, maxHeight);
	}

	// --- [ YGNodeStyleGetMaxHeight ] ---

	public static native void nYGNodeStyleGetMaxHeight(long node, long __result);

	public static YGValue YGNodeStyleGetMaxHeight(long node, YGValue __result) {
		if ( CHECKS )
			check(node);
		nYGNodeStyleGetMaxHeight(node, __result.address());
		return __result;
	}

	// --- [ YGNodeStyleSetAspectRatio ] ---

	/** Unsafe version of: {@link #YGNodeStyleSetAspectRatio NodeStyleSetAspectRatio} */
	public static native void nYGNodeStyleSetAspectRatio(long node, float aspectRatio);

	/**
	 * Aspect ratio controls the size of the undefined dimension of a node.
	 * 
	 * <p>Aspect ratio is encoded as a floating point value width/height. e.g. A value of 2 leads to a node with a width twice the size of its height while a
	 * value of 0.5 gives the opposite effect.</p>
	 * 
	 * <ul>
	 * <li>On a node with a set width/height aspect ratio controls the size of the unset dimension</li>
	 * <li>On a node with a set flex basis aspect ratio controls the size of the node in the cross axis if unset</li>
	 * <li>On a node with a measure function aspect ratio works as though the measure function measures the flex basis</li>
	 * <li>On a node with flex grow/shrink aspect ratio controls the size of the node in the cross axis if unset</li>
	 * <li>Aspect ratio takes min/max dimensions into account</li>
	 * </ul>
	 *
	 * @param node        
	 * @param aspectRatio 
	 */
	public static void YGNodeStyleSetAspectRatio(long node, float aspectRatio) {
		if ( CHECKS )
			check(node);
		nYGNodeStyleSetAspectRatio(node, aspectRatio);
	}

	// --- [ YGNodeStyleGetAspectRatio ] ---

	/** Unsafe version of: {@link #YGNodeStyleGetAspectRatio NodeStyleGetAspectRatio} */
	public static native float nYGNodeStyleGetAspectRatio(long node);

	/**
	 * Aspect ratio controls the size of the undefined dimension of a node.
	 * 
	 * <p>Aspect ratio is encoded as a floating point value width/height. e.g. A value of 2 leads to a node with a width twice the size of its height while a
	 * value of 0.5 gives the opposite effect.</p>
	 * 
	 * <ul>
	 * <li>On a node with a set width/height aspect ratio controls the size of the unset dimension</li>
	 * <li>On a node with a set flex basis aspect ratio controls the size of the node in the cross axis if unset</li>
	 * <li>On a node with a measure function aspect ratio works as though the measure function measures the flex basis</li>
	 * <li>On a node with flex grow/shrink aspect ratio controls the size of the node in the cross axis if unset</li>
	 * <li>Aspect ratio takes min/max dimensions into account</li>
	 * </ul>
	 *
	 * @param node 
	 */
	public static float YGNodeStyleGetAspectRatio(long node) {
		if ( CHECKS )
			check(node);
		return nYGNodeStyleGetAspectRatio(node);
	}

	// --- [ YGNodeLayoutGetLeft ] ---

	public static native float nYGNodeLayoutGetLeft(long node);

	public static float YGNodeLayoutGetLeft(long node) {
		if ( CHECKS )
			check(node);
		return nYGNodeLayoutGetLeft(node);
	}

	// --- [ YGNodeLayoutGetTop ] ---

	public static native float nYGNodeLayoutGetTop(long node);

	public static float YGNodeLayoutGetTop(long node) {
		if ( CHECKS )
			check(node);
		return nYGNodeLayoutGetTop(node);
	}

	// --- [ YGNodeLayoutGetRight ] ---

	public static native float nYGNodeLayoutGetRight(long node);

	public static float YGNodeLayoutGetRight(long node) {
		if ( CHECKS )
			check(node);
		return nYGNodeLayoutGetRight(node);
	}

	// --- [ YGNodeLayoutGetBottom ] ---

	public static native float nYGNodeLayoutGetBottom(long node);

	public static float YGNodeLayoutGetBottom(long node) {
		if ( CHECKS )
			check(node);
		return nYGNodeLayoutGetBottom(node);
	}

	// --- [ YGNodeLayoutGetWidth ] ---

	public static native float nYGNodeLayoutGetWidth(long node);

	public static float YGNodeLayoutGetWidth(long node) {
		if ( CHECKS )
			check(node);
		return nYGNodeLayoutGetWidth(node);
	}

	// --- [ YGNodeLayoutGetHeight ] ---

	public static native float nYGNodeLayoutGetHeight(long node);

	public static float YGNodeLayoutGetHeight(long node) {
		if ( CHECKS )
			check(node);
		return nYGNodeLayoutGetHeight(node);
	}

	// --- [ YGNodeLayoutGetDirection ] ---

	public static native int nYGNodeLayoutGetDirection(long node);

	public static int YGNodeLayoutGetDirection(long node) {
		if ( CHECKS )
			check(node);
		return nYGNodeLayoutGetDirection(node);
	}

	// --- [ YGNodeLayoutGetMargin ] ---

	/** Unsafe version of: {@link #YGNodeLayoutGetMargin NodeLayoutGetMargin} */
	public static native float nYGNodeLayoutGetMargin(long node, int edge);

	/**
	 * Gets the computed value for this nodes after performing layout. If they were set using point values then the returned value will be the same as
	 * {@code YGNodeStyleGetXXX}. However if they were set using a percentage value then the returned value is the computed value used during layout.
	 *
	 * @param node 
	 * @param edge one of:<br><table><tr><td>{@link #YGEdgeLeft EdgeLeft}</td><td>{@link #YGEdgeTop EdgeTop}</td><td>{@link #YGEdgeRight EdgeRight}</td><td>{@link #YGEdgeBottom EdgeBottom}</td><td>{@link #YGEdgeStart EdgeStart}</td><td>{@link #YGEdgeEnd EdgeEnd}</td><td>{@link #YGEdgeHorizontal EdgeHorizontal}</td><td>{@link #YGEdgeVertical EdgeVertical}</td></tr><tr><td>{@link #YGEdgeAll EdgeAll}</td></tr></table>
	 */
	public static float YGNodeLayoutGetMargin(long node, int edge) {
		if ( CHECKS )
			check(node);
		return nYGNodeLayoutGetMargin(node, edge);
	}

	// --- [ YGNodeLayoutGetBorder ] ---

	/** Unsafe version of: {@link #YGNodeLayoutGetBorder NodeLayoutGetBorder} */
	public static native float nYGNodeLayoutGetBorder(long node, int edge);

	/**
	 * Gets the computed value for this nodes after performing layout. If they were set using point values then the returned value will be the same as
	 * {@code YGNodeStyleGetXXX}. However if they were set using a percentage value then the returned value is the computed value used during layout.
	 *
	 * @param node 
	 * @param edge one of:<br><table><tr><td>{@link #YGEdgeLeft EdgeLeft}</td><td>{@link #YGEdgeTop EdgeTop}</td><td>{@link #YGEdgeRight EdgeRight}</td><td>{@link #YGEdgeBottom EdgeBottom}</td><td>{@link #YGEdgeStart EdgeStart}</td><td>{@link #YGEdgeEnd EdgeEnd}</td><td>{@link #YGEdgeHorizontal EdgeHorizontal}</td><td>{@link #YGEdgeVertical EdgeVertical}</td></tr><tr><td>{@link #YGEdgeAll EdgeAll}</td></tr></table>
	 */
	public static float YGNodeLayoutGetBorder(long node, int edge) {
		if ( CHECKS )
			check(node);
		return nYGNodeLayoutGetBorder(node, edge);
	}

	// --- [ YGNodeLayoutGetPadding ] ---

	/** Unsafe version of: {@link #YGNodeLayoutGetPadding NodeLayoutGetPadding} */
	public static native float nYGNodeLayoutGetPadding(long node, int edge);

	/**
	 * Gets the computed value for this nodes after performing layout. If they were set using point values then the returned value will be the same as
	 * {@code YGNodeStyleGetXXX}. However if they were set using a percentage value then the returned value is the computed value used during layout.
	 *
	 * @param node 
	 * @param edge one of:<br><table><tr><td>{@link #YGEdgeLeft EdgeLeft}</td><td>{@link #YGEdgeTop EdgeTop}</td><td>{@link #YGEdgeRight EdgeRight}</td><td>{@link #YGEdgeBottom EdgeBottom}</td><td>{@link #YGEdgeStart EdgeStart}</td><td>{@link #YGEdgeEnd EdgeEnd}</td><td>{@link #YGEdgeHorizontal EdgeHorizontal}</td><td>{@link #YGEdgeVertical EdgeVertical}</td></tr><tr><td>{@link #YGEdgeAll EdgeAll}</td></tr></table>
	 */
	public static float YGNodeLayoutGetPadding(long node, int edge) {
		if ( CHECKS )
			check(node);
		return nYGNodeLayoutGetPadding(node, edge);
	}

	// --- [ YGSetLogger ] ---

	public static native void nYGSetLogger(long logger);

	public static void YGSetLogger(YGLoggerI logger) {
		nYGSetLogger(logger.address());
	}

	// --- [ YGLog ] ---

	/** Unsafe version of: {@link #YGLog Log} */
	public static native void nYGLog(int level, long message);

	/**
	 * 
	 *
	 * @param level   one of:<br><table><tr><td>{@link #YGLogLevelError LogLevelError}</td><td>{@link #YGLogLevelWarn LogLevelWarn}</td><td>{@link #YGLogLevelInfo LogLevelInfo}</td><td>{@link #YGLogLevelDebug LogLevelDebug}</td><td>{@link #YGLogLevelVerbose LogLevelVerbose}</td></tr></table>
	 * @param message 
	 */
	public static void YGLog(int level, ByteBuffer message) {
		if ( CHECKS )
			checkNT1(message);
		nYGLog(level, memAddress(message));
	}

	/**
	 * 
	 *
	 * @param level   one of:<br><table><tr><td>{@link #YGLogLevelError LogLevelError}</td><td>{@link #YGLogLevelWarn LogLevelWarn}</td><td>{@link #YGLogLevelInfo LogLevelInfo}</td><td>{@link #YGLogLevelDebug LogLevelDebug}</td><td>{@link #YGLogLevelVerbose LogLevelVerbose}</td></tr></table>
	 * @param message 
	 */
	public static void YGLog(int level, CharSequence message) {
		MemoryStack stack = stackGet(); int stackPointer = stack.getPointer();
		try {
			ByteBuffer messageEncoded = stack.UTF8(message);
			nYGLog(level, memAddress(messageEncoded));
		} finally {
			stack.setPointer(stackPointer);
		}
	}

	// --- [ YGSetExperimentalFeatureEnabled ] ---

	/**
	 * 
	 *
	 * @param feature one of:<br><table><tr><td>{@link #YGExperimentalFeatureRounding ExperimentalFeatureRounding}</td><td>{@link #YGExperimentalFeatureWebFlexBasis ExperimentalFeatureWebFlexBasis}</td></tr></table>
	 * @param enabled 
	 */
	public static native void YGSetExperimentalFeatureEnabled(int feature, boolean enabled);

	// --- [ YGIsExperimentalFeatureEnabled ] ---

	/**
	 * 
	 *
	 * @param feature one of:<br><table><tr><td>{@link #YGExperimentalFeatureRounding ExperimentalFeatureRounding}</td><td>{@link #YGExperimentalFeatureWebFlexBasis ExperimentalFeatureWebFlexBasis}</td></tr></table>
	 */
	public static native boolean YGIsExperimentalFeatureEnabled(int feature);

	// --- [ YGSetMemoryFuncs ] ---

	public static native void nYGSetMemoryFuncs(long ygmalloc, long yccalloc, long ygrealloc, long ygfree);

	public static void YGSetMemoryFuncs(YGMallocI ygmalloc, YGMallocI yccalloc, YGReallocI ygrealloc, YGFreeI ygfree) {
		nYGSetMemoryFuncs(ygmalloc.address(), yccalloc.address(), ygrealloc.address(), ygfree.address());
	}

}